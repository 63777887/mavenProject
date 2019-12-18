package understandMaven;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XmlDomParse {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db=documentBuilderFactory.newDocumentBuilder();
        db.parse("Student.xml");
        Document document=db.parse("Student.xml");
        NodeList nodeList=document.getElementsByTagName("Student");
        Node node=nodeList.item(0);
        System.out.println(node.getFirstChild().getNextSibling().getNodeValue());
    }
}
