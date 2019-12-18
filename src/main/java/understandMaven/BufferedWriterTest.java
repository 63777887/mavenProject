package understandMaven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BufferedWriterTest {
    static ArrayList al=new ArrayList();
    public static void search(File file){
        if (file.isDirectory()){
            File []temp=file.listFiles();
            for (int i = 0; i < temp.length; i++) {
                search(temp[i]);
            }
        }else{
            if (file.toString().endsWith(".java")){
                al.add(file.getAbsolutePath());
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/edz/project/understandjava");
        File file1=new File("a.txt");
        search(file);
        if (!file1.exists()){
            file1.createNewFile();
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter(file1));
        int count=0;
        while (count<al.size()){
            bw.write(String.valueOf(al.get(count)));
            bw.write('\n');
            bw.flush();
            count++;
        }
        bw.close();
    }
}
