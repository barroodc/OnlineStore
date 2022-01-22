package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.OrderDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.OrderItemDao;
import com.solvd.onlineshop.model.purchase.Order;
import com.solvd.onlineshop.model.purchase.OrderItem;
import com.solvd.onlineshop.services.interfaces.IOrderService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class OrderService implements IOrderService<Order> {

    private static final Logger LOGGER = LogManager.getLogger(OrderService.class);
    private static final OrderDao orderDao;
    private static Order order;

    static {
        orderDao = new OrderDao();
        order = null;
    }

    @Override
    public Order getOrderById(long id) {
        try {
            order = (Order) orderDao.getOrderByID(id);
            LOGGER.info(order);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
