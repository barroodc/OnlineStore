package com.solvd.onlineshop.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class ConnectionPool {



    private static final Logger logger = LogManager.getLogger(ConnectionPool.class);

    private static ConnectionPool connectionPool;
    private List<Connection> connections = new CopyOnWriteArrayList<>();

    private static final String url = "jdbc:mysql://localhost/mydatabase";
    private static final String user = "root";
    private static final String password = "devintern";

    public ConnectionPool() {
        logger.info("Entering ConnectionPool constructor");
        for (int i = 0; i < 15; i++) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, user, password);
                connections.add(con);
            } catch (SQLException | ClassNotFoundException e) {
                logger.error(e);
            }
        }
    }

    public static ConnectionPool getPool() {
        if (connectionPool == null) {
            synchronized (ConnectionPool.class) {
                connectionPool = new ConnectionPool();
            }
        }
        return connectionPool;
    }


    private boolean isConnectionAvailable() {
        if (connections.isEmpty()) {
            try {
                logger.info("connection is empty");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                logger.error(e);
            }
            isConnectionAvailable();
        }
        return true;
    }

    public synchronized Connection getConnection() {
        Connection connection = null;
        if (isConnectionAvailable()) {
            logger.info("Initial pool size" + connections.size());
            connection = connections.get(0);
            connections.remove(0);
            logger.info("Resulting pool size = " + connections.size());
        }
        return connection;
    }

    public synchronized void releaseConnection(Connection connection) {
        connections.add(connection);
    }

    //Access denied for user 'root @ localhost' (using password: YES)


}
