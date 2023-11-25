package com.mufeng.test.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XmlReadTest {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document res = builder.parse("file:test.xml");
            NodeList nameList = res.getElementsByTagName("name");
            Node name = nameList.item(0);
//            System.out.println(name.getTextContent());
            NodeList innerList = res.getElementsByTagName("inner");
            Node inner = innerList.item(0);
            NodeList childNodes = inner.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node cur = childNodes.item(i);
                if(cur.getNodeType() == Node.ELEMENT_NODE){
                    System.out.printf("%s： %s%n", cur.getNodeName(), cur.getTextContent());
                }
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
