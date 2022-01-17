package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.purchase.Order;
import com.solvd.onlineshop.model.purchase.OrderItem;

import java.util.List;


public interface IOrderItemDao extends IBaseDao<OrderItem> {
    List<OrderItem> getOrderItemByID(long id);
}
