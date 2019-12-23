package understandMaven.example.socket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendCilent {
    public static void main(String[] args) {
        DatagramSocket ds;
            try {
                ds = new DatagramSocket();
                InetAddress ip=InetAddress.getByName("192.168.11.22");
                Scanner sc=new Scanner(System.in);
                String s=sc.next();
                while (s!=null) {
                    DatagramPacket dp = new DatagramPacket(s.getBytes(), s.getBytes().length, ip, 1234);
                    ds.send(dp);
                    s=sc.next();
                    if (s.equals("886")){
                        return;
                    }
                }
            } catch (SocketException | UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
