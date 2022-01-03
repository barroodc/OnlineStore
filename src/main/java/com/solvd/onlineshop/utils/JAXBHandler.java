package com.solvd.onlineshop.utils;
import com.solvd.onlineshop.model.product.Inventory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JAXBHandler {


    private static final Logger logger = LogManager.getLogger(JAXBHandler.class);


     /*private static void jaxbXMLFileConversion(String fileName){
        File xmlFile = new File(fileName);
        JAXBContext jaxbContext;

        try {
            jaxbContext = JAXBContext.newInstance(Inventory.class);
            Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
            Inventory inventory = (Inventory) jaxUnmarshaller.unmarshal(xmlFile);
            logger.info(inventory);
        } catch (JAXBException e){
            logger.error(e);
        }

    }

      */

    private static void jaxbXMLFileConversion() {
        try {
            File file = new File("src/main/resources/inventory.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Inventory.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Inventory inventory = (Inventory) unmarshaller.unmarshal(file);
            logger.info(inventory);
        } catch (Exception e) {
            logger.error(e);
        }
    }






   /* public static void main(String[] args) {
        JAXBHandler.jaxbXMLFileConversion();
    }

    */

}
