package understandMaven.example;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

public class Dom4jTest {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader=new SAXReader();
        Document document=saxReader.read("student.xml");
        Element element=document.getRootElement();
        Iterator iterator=element.elementIterator();
        while (iterator.hasNext()) {
            Element et = (Element) iterator.next();
            Iterator it=et.elementIterator();
            while (it.hasNext()){
                Element e=(Element)it.next();
                System.out.println(e.getName()+"---"+e.getStringValue());
            }
        }

    }
}
