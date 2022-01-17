package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.Product;
import com.solvd.onlineshop.model.purchase.Invoice;

import java.util.List;


public interface IProductDao extends IBaseDao<Product>{
   List<Product> getProductByID(long id);
}
