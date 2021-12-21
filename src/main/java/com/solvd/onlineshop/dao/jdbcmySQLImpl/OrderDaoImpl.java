package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IOrderDao;
import com.solvd.onlineshop.model.purchase.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDaoImpl<Order> implements IOrderDao {

    private List<Order> orders;

    public OrderDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(Order entity) {

    }

    @Override
    public void updateEntity(Order entity) {

    }

    @Override
    public Order getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
