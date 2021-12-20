package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.product.ProductSupplier;

import java.util.List;

public interface IProductSupplierDao {
    List<ProductSupplier> getSupplierName();
    ProductSupplier getSupplierByID(Long id);
    void addSupplier(ProductSupplier productSupplier);
    void deleteSupplier(ProductSupplier productSupplier);
}
