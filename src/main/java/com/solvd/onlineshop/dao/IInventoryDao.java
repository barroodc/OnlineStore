package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.Inventory;

import java.util.Map;


public interface IInventoryDao extends IBaseDao<Inventory> {
     Map<String, String> productAndDescription();
     Map<String, Float> productAndPrice();
     Map<String, Integer> productAndAmountInStock();
}
