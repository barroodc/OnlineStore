package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.Product;


public interface IProductDao extends IBaseDao<Product>{
   Product getProductName(String productName);
}
