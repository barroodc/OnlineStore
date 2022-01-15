package com.solvd.onlineshop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;


public class Main {

    private static final String ADDRESS_XML_FILE = "src/main/resources/xmlFiles/entityXMLS/address.xml";
    private static final String CHECKOUT_CART_XML_FILE = "src/main/resources/xmlFiles/entityXMLS/checkoutcart.xml";
    private static final String CITY_XML_FILE = "src/main/resources/xmlFiles/entityXMLS/city.xml";
    private static final String COUNTRY_XML_FILE = "src/main/resources/xmlFiles/entityXMLS/country.xml";
    private static final String DEPARTMENTS_XML_FILE = "src/main/resources/xmlFiles/entityXMLS/departments.xml";

    private static final Logger LOGGER = LogManager.getLogger(Main.class);


    public static void main(String[] args) throws Exception {
       /*try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/onlinestoredb", "root", "devintern");
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("select * from employees");
           while (resultSet.next()) {
               LOGGER.info(resultSet.getString(1));
           }
       } catch (Exception e) {
           LOGGER.error(e);
       }

        */
        Driver d = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(d);
        System.out.println("Driver successfully registered !");

    }
    
}


