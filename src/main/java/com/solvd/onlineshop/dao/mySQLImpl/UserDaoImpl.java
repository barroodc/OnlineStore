package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IUserDao;
import com.solvd.onlineshop.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IUserDao {

    private List<User> users;

    public UserDaoImpl() {
        //arraylist will be initialized here
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserByID(long id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }


    @Override
    public void createEntity(User entity) {

    }

    @Override
    public void updateEntity(User entity) {

    }

    @Override
    public User getEntityById(long id) {
        return null;
    }

    @Override
    public void deleteEntity(long id) {

    }
}
