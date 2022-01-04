package com.solvd.onlineshop.utils;
import com.solvd.onlineshop.model.product.Inventory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class JAXBHandler {


    private static final Logger logger = LogManager.getLogger(JAXBHandler.class);

    private void xmlParsingUsingJaxB(String fileName){
        File xmlFile = new File(fileName);
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Inventory.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            InputStream inputStream = new FileInputStream(xmlFile);
            Inventory inv = (Inventory) jaxbUnmarshaller.unmarshal(inputStream);
            logger.info(inv);
        } catch (JAXBException | FileNotFoundException e) {
            logger.error(e);
        }

    }

    public static void main(String[] args) {
          JAXBHandler example = new JAXBHandler();
          example.xmlParsingUsingJaxB("src/main/resources/inventory.xml");
    }

}
