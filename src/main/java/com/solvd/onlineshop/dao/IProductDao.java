package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.product.Product;

import java.util.List;

public interface IProductDao {

    List<Product> getAllProducts();
    Product getProductsByID(long id);
    void addProduct(Product product);
    void deleteProduct(Product product);
}
