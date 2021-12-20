package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.product.Inventory;

import java.util.List;

public interface IInventoryDao {

    List<Inventory> getAllInventory();
    Inventory getInventoryByID(Long id);
    void updateInventory(Inventory inventory);
    void deleteInventory(Inventory inventory);
}
