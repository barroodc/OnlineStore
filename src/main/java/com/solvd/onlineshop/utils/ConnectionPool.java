package com.solvd.onlineshop.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;


public class ConnectionPool {

    private static final int maximumConnections = 10;
    private static int currentConnections = 0;
    private static ConnectionPool instance;
    private static ArrayBlockingQueue<Connection> poolConnects;
    private static String url;
    private static String userName;
    private static String password;
    private static CredentialValues values;
    private static Properties properties;
    private static Connection connection;
    private static boolean inUse;

    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);


    public static CredentialValues getValues() {
        return values;
    }

    public static void setValues(CredentialValues values) {
        ConnectionPool.values = values;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ConnectionPool.url = url;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        ConnectionPool.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ConnectionPool.password = password;
    }


    public ConnectionPool() {
        CredentialValues credentialValues = new CredentialValues("db.properties");
        currentConnections = 0;
        while (currentConnections < maximumConnections) {
            Connection connection;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(credentialValues.getUrl(),
                                                         credentialValues.getName(), credentialValues.getPassword());
                poolConnects.add(connection);
            } catch (SQLException | ClassNotFoundException e) {
                LOGGER.error(e);
            }
            currentConnections++;
        }
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }


    public static synchronized Connection getConnection() throws Exception {

        try (InputStream input = new FileInputStream("src/main/resources/db.properties")) {
            properties = new Properties();
            properties.load(input);
            LOGGER.info("Retrieving Credentials");
            url = properties.getProperty("url");
            userName = properties.getProperty("username");
            password = properties.getProperty("password");
            connection = DriverManager.getConnection(url,userName,password);
        } catch (Exception e) {
            LOGGER.error(e);
        }
        return connection;
    }
    public synchronized void releaseConnection (Connection connection){
        if (poolConnects.add(connection)) {
            if (poolConnects.size() <= maximumConnections) {
                LOGGER.info("Success");
            } else {
                LOGGER.error("Something went wrong with releasing the connection");
            }
        }
    }

    public static void main(String[] args) throws Exception {
       getInstance();
       getConnection();
    }
}
