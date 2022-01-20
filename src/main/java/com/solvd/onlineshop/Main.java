package com.solvd.onlineshop;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.*;
import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.model.checkout.ItemsInCart;
import com.solvd.onlineshop.model.labor.Departments;
import com.solvd.onlineshop.model.labor.Employees;
import com.solvd.onlineshop.model.labor.Jobs;
import com.solvd.onlineshop.model.location.Address;
import com.solvd.onlineshop.model.location.City;
import com.solvd.onlineshop.model.location.Country;
import com.solvd.onlineshop.model.location.State;
import com.solvd.onlineshop.model.product.*;
import com.solvd.onlineshop.model.purchase.Order;
import com.solvd.onlineshop.model.purchase.OrderItem;
import com.solvd.onlineshop.model.purchase.Transaction;
import com.solvd.onlineshop.model.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;


public class Main {


    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static final String USER_XML_FILE = "src/main/resources/xmlFiles/entityXMLS/user.xml";
    private static final String USER_JSON_FILE = "src/main/java/com/solvd/onlineshop/model/user/User.java";



    public static void main(String[] args) throws Exception {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/onlinestoredb","root","devintern");
            /*------------------------------------------------------------------------ */
            EmployeesDao employeesDao = new EmployeesDao(connection);
            Employees employees = employeesDao.findById(2);
            LOGGER.info(employees.getId());
            /*------------------------------------------------------------------------ */
            ProductCategoryDao productCategoryDao = new ProductCategoryDao(connection);
            ProductCategory productCategory = productCategoryDao.findById(1);
            LOGGER.info(productCategory.getId());
            /*------------------------------------------------------------------------ */
            CityDao cityDao = new CityDao(connection);
            City city = cityDao.findById(1);
            LOGGER.info(city.getId());
            /*------------------------------------------------------------------------ */
            CheckoutCartDao checkoutCartDao = new CheckoutCartDao(connection);
            CheckoutCart checkoutCart = checkoutCartDao.findById(1);
            System.out.println(checkoutCart.getId());
            /*------------------------------------------------------------------------ */
            AddressDao addressDao = new AddressDao(connection);
            Address address = addressDao.findById(1);
            LOGGER.info(address.getId());
            /*------------------------------------------------------------------------ */
            CountryDao countryDao = new CountryDao(connection);
            Country country = countryDao.findById(1);
            LOGGER.info(country.getId());
            /*------------------------------------------------------------------------ */
            DepartmentsDao departmentsDao = new DepartmentsDao(connection);
            Departments departments = departmentsDao.findById(1);
            LOGGER.info(departments.getId());
            /*------------------------------------------------------------------------ */
            InventoryDao inventoryDao = new InventoryDao(connection);
            Inventory inventory = inventoryDao.findById(1);
            LOGGER.info(inventory.getId());
            /*------------------------------------------------------------------------ */
            ItemsInCartDao itemsInCartDao = new ItemsInCartDao(connection);
            ItemsInCart itemsInCart = itemsInCartDao.findById(1);
            LOGGER.info(itemsInCart.getId());
            /*------------------------------------------------------------------------ */
            JobsDao jobsDao = new JobsDao(connection);
            Jobs jobs = jobsDao.findById(1);
            LOGGER.info(jobs.getId());
            /*------------------------------------------------------------------------ */
            OrderDao orderDao = new OrderDao(connection);
            Order order = orderDao.findById(1);
            LOGGER.info(order.getId());
            //check the manual that corresponds to your MySQL server version for the right syntax to use near 'order WHERE id = 1' at line 1
            /*------------------------------------------------------------------------ */
            OrderItemDao orderItemDao = new OrderItemDao(connection);
            OrderItem orderItem = orderItemDao.findById(1);
            LOGGER.info(orderItem.getId());
            /*------------------------------------------------------------------------ */
            ProductDao productDao = new ProductDao(connection);
            Product product = productDao.findById(1);
            LOGGER.info(product.getId());
            /*------------------------------------------------------------------------ */
            ProductReviewDao productReviewDao = new ProductReviewDao(connection);
            ProductReview productReview = productReviewDao.findById(1);
            LOGGER.info(productReview.getId());
            /*------------------------------------------------------------------------ */
            ProductSupplierDao productSupplierDao = new ProductSupplierDao(connection);
            ProductSupplier productSupplier = productSupplierDao.findById(1);
            LOGGER.info(productSupplier.getId());
            /*------------------------------------------------------------------------ */
            StateDao stateDao = new StateDao(connection);
            State state = stateDao.findById(1);
            LOGGER.info(state.getId());
            /*------------------------------------------------------------------------ */
            TransactionDao transactionDao = new TransactionDao(connection);
            Transaction transaction = transactionDao.findById(1);
            LOGGER.info(transaction.getId());
            /*------------------------------------------------------------------------ */
            UserDao userDao = new UserDao(connection);
            User user = userDao.findById(1);
            LOGGER.info(user.getId());
        } catch (SQLException e) {
            LOGGER.error(e);
        }

        try {
            String json = "{\"id\":\"1\",\"employeesID\":\"1\",\"fName\":\"Annette\",\"mName\":\"Emily\",\"lName\":\"Smith\",\"mobile\":\"3268408450\",\"email\":\"annette74@yahoo.com\",\"password\":\"fHMpqaPGW9e7sy3W\",\"userName\":\"Annette1\",\"timeCreated\":\"2021-10-18T10:15:17.075Z\",\"lastLogin\":\"2021-12-02T13:26:48.976Z\"}";

            ObjectMapper mapper = new ObjectMapper();
            SimpleModule module = new SimpleModule("UserDeserializer");
            mapper.registerModule(module);
            User user = mapper.readValue(json, User.class);
            LOGGER.info(user);
        } catch (Exception e){
            LOGGER.error(e);
        }



    }

}


    



