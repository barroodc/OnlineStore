package com.solvd.onlineshop.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;

import static java.lang.Class.forName;


public class ConnectionPool {

    private static final int maximumConnections = 10;
    private static int currentConnections = 0;
    private static ConnectionPool instance;
    private static ArrayBlockingQueue<Connection> poolConnects;
    private static String url;
    private static String userName;
    private static String password;
    private static CredentialValues values;

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

    public static void setPoolConnects(ArrayBlockingQueue<Connection> poolConnects) {
        ConnectionPool.poolConnects = poolConnects;
    }


    public ConnectionPool() {
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                    poolConnects = new ArrayBlockingQueue<>(10);
                }
                try (InputStream input = new FileInputStream("src/main/resources/db.properties")) {
                    Properties properties = new Properties();
                    properties.load(input);
                    url = properties.getProperty("url");
                    userName = properties.getProperty("username");
                    password = properties.getProperty("password");
                } catch (IOException e) {
                    LOGGER.error(e);
                }
            }
        }
        return instance;

    }


    public static synchronized Connection getConnection() throws Exception {
        Connection result = null;
        boolean finished = false;
        if (currentConnections < maximumConnections) {
            try {
                currentConnections++;
                forName("com.mysql.cj.jdbc.Driver");
                result = DriverManager.getConnection(url, userName, password);
                finished = true;
            } catch (Exception e) {
                LOGGER.error(e.getMessage() + "hello world");
            }
        }
        if (!finished) {
            Connection con = poolConnects.take();
            LOGGER.info("Connection successful.");

            result = con;
        }
        return result;
    }

    public synchronized void releaseConnection (Connection connection){
        if (poolConnects.add(connection)) {
            if (poolConnects.size() <= maximumConnections) {
                LOGGER.info("Success");
            } else {
                LOGGER.error("Warning: Failure to pool");
            }
        }
    }
}
