package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.labor.Employees;
import com.solvd.onlineshop.model.product.Inventory;

import java.util.List;
import java.util.Map;


public interface IInventoryDao extends IBaseDao<Inventory> {
     List<Inventory> getAllInventory(long id);
}
