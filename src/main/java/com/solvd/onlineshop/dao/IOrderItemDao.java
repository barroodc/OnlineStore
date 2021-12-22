package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.purchase.OrderItem;


public interface IOrderItemDao extends IBaseDao<OrderItem> {
    OrderItem getProductIdentifiers(String sku, float price);
    void currentDiscount();
    void timeOfOrder();
}
