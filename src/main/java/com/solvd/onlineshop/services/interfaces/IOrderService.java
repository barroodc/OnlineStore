package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.purchase.Order;

public interface IOrderService<T> {

    Order getOrderById(long id);
}
