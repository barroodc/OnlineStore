package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.user.User;

import java.sql.Date;


public interface IUserDao extends IBaseDao<User> {
    User getNameAndNumber(String firstName, String middleName, String lastName, String mobile);
    User getAccountInformation(Date timeCreated, String email, String username, String password, Date lastLogin);
}
