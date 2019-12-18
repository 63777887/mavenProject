package understandMaven.example;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.IOException;
import java.nio.charset.Charset;

public class CsvTest {
    public static void main(String[] args) throws IOException {
        CsvWriter csvWriter=new CsvWriter("test.csv", '.', Charset.forName("utf-8"));
        String []str={"学生编号","学生姓名","学生年龄","学生住址"};
        //具体的内容信息
        String [] comment1={"9527","王五1","21","垃圾桶"};
        String [] comment2={"9528","王五2","21","垃圾桶"};
        String [] comment3={"9529","王五3","21","垃圾桶"};

        csvWriter.writeRecord(str);
        csvWriter.writeRecord(comment1);
        csvWriter.writeRecord(comment2);
        csvWriter.writeRecord(comment3);
        csvWriter.close();

        CsvReader csvReader=new CsvReader("test.csv",'.',Charset.forName("utf-8"));
        csvReader.readHeaders();
        while (csvReader.readRecord()){
            System.out.println(csvReader.getRawRecord());
        }
    }
}
