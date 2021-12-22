package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IOrderItemDao;
import com.solvd.onlineshop.model.purchase.OrderItem;

import java.util.List;

public class OrderItemDaoImpl extends BaseDaoImpl<OrderItem> implements IOrderItemDao {

    private List<OrderItem> orderItems;

    public OrderItemDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(OrderItem entity) {

    }

    @Override
    public void updateEntity(OrderItem entity) {

    }

    @Override
    public OrderItem getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

    @Override
    public OrderItem getProductIdentifiers(String sku, float price) {
        return null;
    }

    @Override
    public void currentDiscount() {

    }

    @Override
    public void timeOfOrder() {

    }
}
