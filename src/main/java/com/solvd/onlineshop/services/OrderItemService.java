package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.JobsDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.OrderItemDao;
import com.solvd.onlineshop.model.labor.Jobs;
import com.solvd.onlineshop.model.purchase.OrderItem;
import com.solvd.onlineshop.services.interfaces.IOrderItemService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class OrderItemService implements IOrderItemService<OrderItem> {

    private static final Logger LOGGER = LogManager.getLogger(OrderItemService.class);
    private static final OrderItemDao orderItemDao;
    private static OrderItem orderItem;

    static {
        orderItemDao = new OrderItemDao();
        orderItem = null;
    }

    @Override
    public OrderItem getOrderItemById(long id) {
        try {
            orderItem = (OrderItem) orderItemDao.getOrderItemByID(id);
            LOGGER.info(orderItem);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
