package understandMaven.example.lockTest;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LockTwiceTest {
    public static void main(String[] args) throws InterruptedException {
//        Tool tool=new Tool();
//       LockTwiceAdd t1=new LockTwiceAdd("线程A",tool);
//        LockTwiceAdd t2=new LockTwiceAdd("线程B",tool);
//        LockTwiceDel t3=new LockTwiceDel("线程C",tool);
//        LockTwiceDel t4=new LockTwiceDel("线程D",tool);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
        try {
            System.out.println(InetAddress.getByName("58.213.131.174").getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

