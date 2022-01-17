package com.solvd.onlineshop.utils;


import com.solvd.onlineshop.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;



public class DOMParser {

    private static final Logger LOGGER = LogManager.getLogger(DOMParser.class);


    public static void main(String[] args){
        try {
            File fXmlFile = new File("src/main/resources/xmlFiles/entityXMLS/domtest.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("Dom Parser Example");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("id : " + element.getAttribute("id"));

                    System.out.println("\nELEMENTS :");
                    System.out.println("HusbandName : " + element.getElementsByTagName("HusbandName").item(0).getTextContent());
                    System.out.println("WifeName: " + element.getElementsByTagName("WifeName").item(0).getTextContent());
                    System.out.println("MarriageStatus : " + element.getElementsByTagName("MarriageStatus").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }
}