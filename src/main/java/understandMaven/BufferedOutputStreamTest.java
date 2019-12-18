package understandMaven;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws IOException {
        File file=new File("b.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        String s="asdafdfsfvvxcgfhjkmndsfbcjgfdseroiutjklfjesd";
        byte []b=s.getBytes();
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(file));
        for (int i = 0; i < b.length/3; i++) {
            for (int j = 0; j < 3; j++) {
                bo.write(b[j+i*3]);
            }
            if (b.length%3==0&&i==b.length/3-1){
            }else
                bo.write(',');
            if (i%5==0&&i!=0){
                bo.write('\n');
            }
        }
        for (int i = (int)((double)(b.length/3)-1); i <b.length%3+((double)(b.length/3)-1); i++) {
            bo.write(b[i]);
        }
        bo.write('.');
        bo.flush();
        bo.close();
    }
}
