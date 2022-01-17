package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.purchase.Invoice;
import com.solvd.onlineshop.model.user.User;

import java.sql.Date;
import java.util.List;


public interface IUserDao extends IBaseDao<User> {
    List<User> getAllUsersByID(long id);
}
