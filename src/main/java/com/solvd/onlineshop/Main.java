package com.solvd.onlineshop;

import com.solvd.onlineshop.model.product.Inventory;
import com.solvd.onlineshop.utils.ConnectionPool;
import com.solvd.onlineshop.utils.JAXBHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) {


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
