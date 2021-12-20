package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.purchase.OrderItem;

import java.util.List;

public interface IOrderItemDao {

    List<OrderItem> getAllOrderItems();
    OrderItem getOrderItemByID(long id);
    void addOrderItem(OrderItem orderItem);
    void deleteOrderItem(OrderItem orderItem);
}
