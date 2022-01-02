package com.solvd.onlineshop.utils;

import com.mysql.cj.jdbc.ConnectionImpl;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPool {

    private static final int maximumConnections = 10;
    private static int currentConnections = 0;
    private static ConnectionPool instance;
    private static LinkedBlockingQueue<Connection> pool;
    private static String url;
    private static String userName;
    private static String password;
    private static CredentialValues values;
    private static Properties properties;
    private static final AtomicInteger counter = new AtomicInteger(0);

    private static final Logger logger = LogManager.getLogger(ConnectionPool.class);

    public static AtomicInteger getCounter() {
        return counter;
    }

    public static CredentialValues getValues() {
        return values;
    }

    public static void setValues(CredentialValues values) {
        ConnectionPool.values = values;
    }

    public ConnectionPool() {

    }

    public ConnectionPool(String url, String userName, String password){
        ConnectionPool.url = values.getUrl();
        ConnectionPool.userName = values.getName();
        ConnectionPool.password = values.getPassword();
    }



    public static synchronized ConnectionPool getInstance() throws IOException {

        if (instance == null){
            synchronized (ConnectionPool.class){
                if (instance == null){
                    instance = new ConnectionPool();
                    pool = new LinkedBlockingQueue<>(10);
                }
            }
        }
        try (InputStream input = new FileInputStream("src/main/resources/db.properties")) {
            properties = new Properties();
            properties.load(input);
            logger.info("Retrieving Credentials");
            url = properties.getProperty("url");
            userName = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (Exception e){
            logger.error(e);
        }
        return instance;

    }


    public static synchronized Connection getConnection() throws Exception{

        currentConnections = counter.getAndIncrement();
        Connection con = null;
        if (currentConnections < maximumConnections){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                url = "jdbc:mysql://52.59.193.212:3306/onlinestoredb";
                userName= "root";
                password = "devintern";
                con = DriverManager.getConnection(url,userName,password);
                currentConnections++;
                logger.info("Connection Created");
                con.close();
                logger.info("Connection Closed");
            } catch (Exception e) {
                logger.error(e);
            }

        }
        return con;
    }

    public synchronized void releaseConnection(Connection connection) {
        if (pool.add(connection)) {
            if (pool.size() <= maximumConnections) {
                logger.info("Connection pooling is a success!");
            } else {
                logger.error("Something went wrong with releasing the connection");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        getInstance();
        getConnection();
    }
}
