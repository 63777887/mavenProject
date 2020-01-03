package understandMaven.example.test4.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;


public class Login {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(),4545);
        OutputStreamWriter socketOut =  new OutputStreamWriter(socket.getOutputStream());
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));

        String line = null;

        while((line = keyReader.readLine())!=null){

            socketOut.write(line+"\r\n");
            socketOut.flush();
            line = socketReader.readLine();
            System.out.println("服务端回送的数据是："+line);
            if(line.equals("bisxt")){
                System.out.println("游戏结束！");
                if (line.equals("bisxt")){
                    System.out.println("登陆成功");
                    break;
                }
            }
        }
        socket.close();
    }
}

