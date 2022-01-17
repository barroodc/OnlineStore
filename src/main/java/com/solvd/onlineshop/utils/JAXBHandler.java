package com.solvd.onlineshop.utils;
import com.solvd.onlineshop.model.labor.Departments;
import com.solvd.onlineshop.model.labor.Jobs;
import com.solvd.onlineshop.model.product.Inventory;
import com.solvd.onlineshop.model.purchase.Invoice;
import com.solvd.onlineshop.model.purchase.Transaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class JAXBHandler {


    private static final Logger LOGGER = LogManager.getLogger(JAXBHandler.class);

    public static void marshal (Departments departments, File selectedFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
            JAXBContext jaxbContext = JAXBContext.newInstance(Departments.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(departments, writer);
        } catch (IOException | JAXBException e) {
            LOGGER.error(e);
        }
    }

    public static Departments unmarshal(File importFile) {
        Departments departments = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Departments.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            departments = (Departments) unmarshaller.unmarshal(importFile);
        } catch (JAXBException e) {
           LOGGER.error(e);
        }
        return departments;
    }

    /*public static void main(String[] args) {
      Departments chessMaterials = new Departments(1L,"Marketing");
      try {
          JAXBHandler.marshal(chessMaterials, new File("src/main/resources/xmlFiles/entityXMLS/departments.xml"));
          Departments events = JAXBHandler.unmarshal(new File("src/main/resources/xmlFiles/entityXMLS/departments.xml"));
          LOGGER.info(events);
      } catch (Exception e) {
          LOGGER.error(e);
      }
    }

     */

}
