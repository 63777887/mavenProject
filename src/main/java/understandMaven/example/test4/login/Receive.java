package understandMaven.example.test4.login;

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

        ServerSocket serverSocket = new ServerSocket(4545);
        Socket socket = serverSocket.accept();

        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        OutputStreamWriter socketOut =  new OutputStreamWriter(socket.getOutputStream());

        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
        int count=5;
        String line = null;
        while((line = socketReader.readLine())!=null) {
            System.out.println("服务端接收到的数据：" + line);
            String bingo = "bjsxt";
            if (line.equals(bingo)) {
                if (line.equals(bingo)) {
                    line = "恭喜你猜对了！";
                    socketOut.write(line + "\r\n");
                    socketOut.flush();
                }
            } else if (line.compareTo(bingo) > 0) {
                line = "错误";
                socketOut.write(line + "\r\n");
                socketOut.flush();
            }
        }

        serverSocket.close();
    }

}

