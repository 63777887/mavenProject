package understandMaven.example;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MyHandler extends DefaultHandler {
    private List list;
    private Student student;
    private String s;

    public List getList() {
        return list;
    }

    @Override
    public void startDocument() throws SAXException {
        list=new ArrayList<>();
        System.out.println("开始解析...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("停止解析...");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("开始解析"+qName);
        if (qName!=null){
            s=qName;
            if (qName.equals("Student")){
                student=new Student();
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName!=null){
            if (qName.equals("Student")){
                list.add(student);
            }
        }
        s=null;
        System.out.println("结束解析的元素"+qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str=new String(ch,start,length);
        if (s!=null){
        if (s.equals("name")){
        student.setName(str);
        }
        if (s.equals("age")){
            student.setAge(Integer.valueOf(str));
        }
        }
    }
}
