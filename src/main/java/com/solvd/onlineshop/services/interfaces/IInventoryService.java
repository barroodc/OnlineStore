package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.product.Inventory;

public interface IInventoryService<T> {
    Inventory getInventoryById(long id);
}
