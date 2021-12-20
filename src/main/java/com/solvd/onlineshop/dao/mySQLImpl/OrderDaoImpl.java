package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IOrderDao;
import com.solvd.onlineshop.purchase.Order;

import java.util.List;

public class OrderDaoImpl implements IOrderDao {

    private List<Order> orders;

    public OrderDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public Order getOrderByID(Long id) {
        return null;
    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public void deleteOrder(Order order) {

    }
}
