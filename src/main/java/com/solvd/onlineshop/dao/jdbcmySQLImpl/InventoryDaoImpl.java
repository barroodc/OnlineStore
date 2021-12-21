package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IInventoryDao;
import com.solvd.onlineshop.model.product.Inventory;

import java.util.List;

public class InventoryDaoImpl extends BaseDaoImpl<Inventory> implements IInventoryDao {

    private List<Inventory> inventories;

    public InventoryDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(Inventory entity) {

    }

    @Override
    public void updateEntity(Inventory entity) {

    }

    @Override
    public Inventory getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
