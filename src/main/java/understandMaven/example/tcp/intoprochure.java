package understandMaven.example.tcp;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class intoprochure {
    public static void main(String[] args) throws IOException {
        Socket so = null;
        BufferedOutputStream os=null;
        BufferedInputStream is=null;
        File file=new File("timg.jpg");
        Scanner sc=new Scanner(System.in);
        while (true) {

            try {
                is = new BufferedInputStream(new FileInputStream(file));
                byte[] by = new byte[(int) file.length()];
                so = new Socket(InetAddress.getLocalHost(), 5678);
                os = new BufferedOutputStream(so.getOutputStream());
                int d;
                while ((d = is.read(by, 0, by.length)) != -1) {
                    os.write(by, 0, d);
                    os.flush();
                }
                int b;
                InputStream is1=so.getInputStream();
                byte []by1=new byte[1000];
                while ((b=is1.read(by1)) != -1){

                }
                System.out.println(by1);
            } catch (IOException e) {
                e.printStackTrace();

//            } finally {
//                if (os != null) {
//                    try {
//                        os.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                if (is != null) {
//                    is.close();
//                }
            }

        }
    }

}
