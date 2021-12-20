package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IOrderItemDao;
import com.solvd.onlineshop.purchase.OrderItem;

import java.util.List;

public class OrderItemDaoImpl implements IOrderItemDao {

    private List<OrderItem> orderItems;

    public OrderItemDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<OrderItem> getAllOrderItems() {
        return null;
    }

    @Override
    public OrderItem getOrderItemByID(Long id) {
        return null;
    }

    @Override
    public void addOrderItem(OrderItem orderItem) {

    }

    @Override
    public void deleteOrderItem(OrderItem orderItem) {

    }
}
