package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.EmployeesDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.InventoryDao;
import com.solvd.onlineshop.model.labor.Employees;
import com.solvd.onlineshop.model.location.Country;
import com.solvd.onlineshop.model.product.Inventory;
import com.solvd.onlineshop.services.interfaces.IInventoryService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class InventoryService implements IInventoryService<Inventory> {

    private static final Logger LOGGER = LogManager.getLogger(InventoryService.class);
    private static final InventoryDao inventoryDao;
    private static Inventory inventory;

    static {
        inventoryDao = new InventoryDao();
        inventory = null;
    }

    @Override
    public Inventory getInventoryById(long id) {
        try {
            inventory = (Inventory) inventoryDao.getAllInventory(id);
            LOGGER.info(inventory);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
