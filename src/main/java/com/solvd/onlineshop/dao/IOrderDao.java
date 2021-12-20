package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.purchase.Order;

import java.util.List;

public interface IOrderDao {

    List<Order> getAllOrders();
    Order getOrderByID(Long id);
    void updateOrder(Order order);
    void deleteOrder(Order order);
}
