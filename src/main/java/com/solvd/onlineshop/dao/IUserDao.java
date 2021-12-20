package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.user.User;

import java.util.List;

public interface IUserDao extends IBaseDao<User> {

    List<User> getAllUsers();
    User getUserByID(long id);
    void updateUser(User user);
    void deleteUser(User user);
}
