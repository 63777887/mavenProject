package understandMaven.example.test4.game;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;


public class Receive {

    public static void main(String[] args) throws IOException {
        int res = (int) (Math.random() * 49+1);

        ServerSocket serverSocket = new ServerSocket(4545);
        Socket socket = serverSocket.accept();

        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        OutputStreamWriter socketOut =  new OutputStreamWriter(socket.getOutputStream());

        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
        int count=5;
        String line = null;
        while((line = socketReader.readLine())!=null){
            System.out.println("服务端接收到的数据："+ line);
            String bingo = Integer.toString(res);
            if(line.equals(bingo)){
                line = "恭喜你猜对了！";
                socketOut.write(line+"\r\n");
                socketOut.flush();
            }
            else if (line.compareTo(bingo)>0){
                line = "大了";
                socketOut.write(line+"\r\n");
                socketOut.flush();
            }else {
                line = "小了";
                socketOut.write(line+"\r\n");
                socketOut.flush();
            }
            count--;
            if (count<=1){
                line = "次数已用完";
                socketOut.write(line+"\r\n");
                socketOut.flush();
                break;
            }
        }

        serverSocket.close();
    }

}
