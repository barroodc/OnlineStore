package com.solvd.onlineshop.utils;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConnectionPool {

    private static final BasicDataSource source = new BasicDataSource();
    private static final Logger logger = LogManager.getLogger(ConnectionPool.class);

    static {
        source.setDriverClassName("com.mysql.jbdc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/onlinestoredb");
        source.setUsername("user");
        source.setPassword("password");
    }

    public static void getConnection() throws SQLException {

        Connection toDatabase = source.getConnection();
        Statement statement = toDatabase.createStatement();
        //query would be entered into getResult set to select all columns(or a specific column from the table)
        ResultSet queryResult = statement.getResultSet();
        try {
         //The while loop would then pull the value of the given data point in the column
         while (queryResult.next()) {
             logger.info(queryResult.getString("name"));
             logger.info(queryResult.getString("email"));
             logger.info(queryResult.getInt("user_id"));
         }
        } catch (SQLException e) {
          logger.error(e);
        }

        queryResult.close();
        statement.close();
        toDatabase.close();
    }
}
