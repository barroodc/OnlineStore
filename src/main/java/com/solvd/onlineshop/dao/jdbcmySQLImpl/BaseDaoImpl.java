package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IBaseDao;
import com.solvd.onlineshop.utils.DataTransferObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.rmi.runtime.Log;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class BaseDaoImpl<T> implements IBaseDao<T> {

    private static final Logger logger = LogManager.getLogger(BaseDaoImpl.class);
    protected final Connection connection;
    protected final static String LAST_VAL = "SELECT last_value FROM";



    public BaseDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public abstract T findById(long id);
    public abstract List<T> findAll();
    public abstract T update(T dto);
    public abstract T create(T dto);
    public abstract void delete(long id);

    protected int getLastVal(String sequence){
        int key = 0;
        String sql = LAST_VAL + sequence;
        try(Statement statement = connection.createStatement()){
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                key=rs.getInt(1);
            }
            return key;
        }catch (SQLException e ){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

}

    /*private static final Logger logger = LogManager.getLogger(BaseDaoImpl.class);

    protected final Connection connection;
    protected final static String LAST_VAL = "SELECT last_value FROM";
    protected final static String CUSTOMER_SEQUENCE = "onlinestore_user_seq";

    public BaseDaoImpl(Connection connection) {
        super();
        this.connection = connection;
    }

    public abstract T findById(long id);
    public abstract List<T> findAll();
    public abstract T update(T dto);
    public abstract T create(T dto);
    public abstract void delete(long id);

    protected int getLastVal(String sequence) {
        int key = 0;
        String sql = LAST_VAL + sequence;
        try(Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                key = rs.getInt(1);
            }
            return key;
        } catch (SQLException e) {
            logger.error(e);
            throw new RuntimeException();
        }
    }

     */
