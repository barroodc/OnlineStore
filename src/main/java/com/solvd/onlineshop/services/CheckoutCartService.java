package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.CheckoutCartDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.UserDao;
import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.model.user.User;
import com.solvd.onlineshop.services.interfaces.ICheckoutCartService;
import com.solvd.onlineshop.services.interfaces.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class CheckoutCartService implements ICheckoutCartService {

    private ICheckoutCartService<CheckoutCart> checkoutDao = (ICheckoutCartService<CheckoutCart>) new CheckoutCartDao();
    private IUserService<User> userDao = (IUserService<User>) new UserDao();

    private static final Logger logger = LogManager.getLogger(CheckoutCartService.class);

    @Override
    public CheckoutCart getCheckoutCartById(long id) {
       return null;
    }
}
