package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.product.ProductSupplier;

public interface IProductSupplierService<T> {

    ProductSupplier getProductSupplierById(long id);
}
