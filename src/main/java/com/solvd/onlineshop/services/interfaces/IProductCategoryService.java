package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.product.ProductCategory;

public interface IProductCategoryService<T> {

    ProductCategory getProductCategoryById(long id);
}
