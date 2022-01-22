package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.TransactionDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.UserDao;
import com.solvd.onlineshop.model.purchase.Transaction;
import com.solvd.onlineshop.model.user.User;
import com.solvd.onlineshop.services.interfaces.IUserService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class UserService implements IUserService<User> {

    private static final Logger LOGGER = LogManager.getLogger(User.class);
    private static final UserDao userDao;
    private static User user;

    static {
        userDao = new UserDao();
        user = null;
    }

    @Override
    public User getUserById(long id) {
        try {
            user = (User) userDao.getAllUsersByID(id);
            LOGGER.info(user);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
