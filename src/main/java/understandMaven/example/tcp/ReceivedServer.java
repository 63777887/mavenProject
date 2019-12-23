package understandMaven.example.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceivedServer {
    public static void main(String[] args) {
        int i=1;
        File file=new File("abc"+(i++)+".jpg");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        InputStream is=null;
        OutputStream os=null;
        ServerSocket serverSocket=null;
        try {
            serverSocket=new ServerSocket(5678);
            Socket s=serverSocket.accept();
            is =new BufferedInputStream(s.getInputStream());
            byte[]by=new byte[6999999];
            int d;
            os=new BufferedOutputStream(new FileOutputStream(file));
            while ((d=is.read(by))!=-1){
                os.write(by,0,d);
                os.flush();
            }
            OutputStream o=s.getOutputStream();
            o.write("图片上传成功".getBytes());
            o.flush();
        } catch (IOException e) {
            e.printStackTrace();
//        }finally {
//            if (os != null) {
//                try {
//                    os.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (is != null) {
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }
}
