package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IUserDao;
import com.solvd.onlineshop.model.user.User;

import java.util.List;

public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

    private List<User> users;

    public UserDaoImpl() {
        //arraylist will be initialized here
    }

    @Override
    public void createEntity(User entity) {

    }

    @Override
    public void updateEntity(User entity) {

    }

    @Override
    public User getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
