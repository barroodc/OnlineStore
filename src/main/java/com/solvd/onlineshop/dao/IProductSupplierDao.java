package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.ProductSupplier;

import java.util.Map;


public interface IProductSupplierDao extends IBaseDao<ProductSupplier> {
    Map<String, String> supplierAndProductsSupplied();
}
