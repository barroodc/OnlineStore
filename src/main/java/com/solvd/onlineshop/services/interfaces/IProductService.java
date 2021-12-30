package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.product.Product;

public interface IProductService<T> {

    Product getProductById(long id);
}
