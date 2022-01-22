package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.AddressDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.CheckoutCartDao;
import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.model.location.Address;
import com.solvd.onlineshop.services.interfaces.ICheckoutCartService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CheckoutCartService implements ICheckoutCartService<CheckoutCart> {


    private static final Logger LOGGER = LogManager.getLogger(CheckoutCartService.class);
    private static final CheckoutCartDao checkoutCartDao;
    private static CheckoutCart checkoutCart;

    static {
        checkoutCartDao = new CheckoutCartDao();
        checkoutCart = null;
    }

    @Override
    public CheckoutCart getCheckoutCartById(long id) {
        try {
            checkoutCart = (CheckoutCart) checkoutCartDao.getCheckoutCartByID(id);
            LOGGER.info(checkoutCart);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;

    }

}
