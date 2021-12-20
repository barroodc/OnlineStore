package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IInventoryDao;
import com.solvd.onlineshop.product.Inventory;

import java.util.List;

public class InventoryDaoImpl implements IInventoryDao {

    private List<Inventory> inventories;

    public InventoryDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<Inventory> getAllInventory() {
        return null;
    }

    @Override
    public Inventory getInventoryByID(Long id) {
        return null;
    }

    @Override
    public void updateInventory(Inventory inventory) {

    }

    @Override
    public void deleteInventory(Inventory inventory) {

    }
}
