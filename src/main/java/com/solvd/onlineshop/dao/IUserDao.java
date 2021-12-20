package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.user.User;

import java.util.List;

public interface IUserDao {

    List<User> getAllUsers();
    User getUserByID(Long id);
    void updateUser(User user);
    void deleteUser(User user);
}
