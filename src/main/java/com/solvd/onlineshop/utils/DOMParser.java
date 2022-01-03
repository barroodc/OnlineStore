package com.solvd.onlineshop.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.stream.IntStream;

public class DOMParser {

    private static final Logger logger = LogManager.getLogger(DOMParser.class);

    private void parser() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("src/main/resources/inventory.xml"));
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("Clothes");

            for (int i = 1; i < nodeList.getLength(); i++) {
                Node c = nodeList.item(i);
                if (c.getNodeType() == Node.ELEMENT_NODE) {
                    Element clothes = (Element) c;
                    String id = clothes.getAttribute("id");
                    NodeList clothesList = clothes.getChildNodes();
                    for (int j = 0; j < clothesList.getLength(); j++) {
                        Node n = clothesList.item(j);
                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                            Element name = (Element) n;
                            logger.info("Clothes " + id + ": " + name.getTagName() + " = " + name.getTextContent());
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            logger.error(e);
        }

    }

   /* public static void main(String[] args) {
        DOMParser parser = new DOMParser();
        parser.parser();
    }

    */
}