package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IBaseDao;

import java.sql.Connection;

public abstract class AbstractMySQLDao<T> implements IBaseDao<T> {
    protected  Connection connection;

    public AbstractMySQLDao(Connection connection) {
        this.connection = connection;
    }

    public AbstractMySQLDao(){

    }

    /*public BaseDao(Connection connection) {
        this.connection = connection;
    }

    public BaseDao() {

    }

     */
}
