package understandMaven.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class xmlSaxParse {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
        SAXParser saxParser=saxParserFactory.newSAXParser();
        MyHandler myHandler=new MyHandler();
        saxParser.parse("Student.xml",myHandler);
        List list=myHandler.getList();
        for (Object o : list) {
            Student student=(Student) o;
            System.out.println(student.toString());
        }
    }
}
