package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.ProductSupplier;
import com.solvd.onlineshop.model.purchase.Invoice;

import java.util.List;
import java.util.Map;


public interface IProductSupplierDao extends IBaseDao<ProductSupplier> {
    List<ProductSupplier> getAllProductSuppliersByID(long id);
}
