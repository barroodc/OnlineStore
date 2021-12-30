package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.purchase.OrderItem;

public interface IOrderItemService {

    OrderItem getOrderItemById(long id);
}
