package understandMaven.example.socket;

import java.net.*;
import java.util.Scanner;

public class ReceviedServer {

    { try {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        while(s!=null) {

            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            DatagramPacket dp;
            s = sc.next();
        }
            } catch (SocketException | UnknownHostException e) {
                e.printStackTrace();
            }

    }
}
