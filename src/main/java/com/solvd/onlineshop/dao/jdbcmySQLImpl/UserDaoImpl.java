package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IUserDao;
import com.solvd.onlineshop.model.user.User;

import java.sql.Date;
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

    @Override
    public User getNameAndNumber(String firstName, String middleName, String lastName, String mobile) {
        return null;
    }

    @Override
    public User getAccountInformation(Date timeCreated, String email, String username, String password, Date lastLogin) {
        return null;
    }
}
