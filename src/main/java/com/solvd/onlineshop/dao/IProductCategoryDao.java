package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.Product;
import com.solvd.onlineshop.model.product.ProductCategory;

public interface IProductCategoryDao extends IBaseDao<ProductCategory> {
    ProductCategory getProductName(String productName);
    ProductCategory getClassifications(String title, String metaTitle);
}
