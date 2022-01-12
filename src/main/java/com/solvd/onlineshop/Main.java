package com.solvd.onlineshop;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) throws Exception {



         /*DatabaseMetaData md = conn.getMetaData();
        ResultSet rs = md.getTables(null, null, "%", null);
        while (rs.next()) {
            System.out.println(rs.getString(3));
        }  }

    static Connection conn;

    static Statement st;

    static {
        try {
            // Step 1: Load the JDBC driver.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded.");
            // Step 2: Establish the connection to the database.
            String url = "jdbc:mysql://52.59.193.212:3306/onlinestoredb";

            conn = DriverManager.getConnection(url, "root", "devintern");
            System.out.println("Got Connection.");

            st = conn.createStatement();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            e.printStackTrace();
            System.exit(0);
        }
    }
    
          */



        /*
        ICheckoutCartDao iCheckoutCartDao = new CheckoutCartDaoImpl();

        for (CheckoutCart checkoutCart: iCheckoutCartDao.getAllCheckoutCarts()) {
            logger.info("Cart ID Number: " + checkoutCart.getId());
        }

        CheckoutCart checkoutCart = iCheckoutCartDao.getAllCheckoutCarts().get(0);
        checkoutCart.setEmail("josephsmith@hotmail.com");
        iCheckoutCartDao.updateCheckoutCart(checkoutCart);
    }

         */
    }
}


