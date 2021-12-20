package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.product.Product;
import com.solvd.onlineshop.product.ProductCategory;

import java.util.List;

public interface IProductCategoryDao {

    List<ProductCategory> getAllProductCategories();
    ProductCategory getProductCategoryByID(long id);
    void updateProductCategory(ProductCategory productCategory);
    void deleteProductCategory(ProductCategory productCategory);
}
