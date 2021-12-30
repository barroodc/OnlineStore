package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.product.ProductCategory;

public interface IProductCategoryService {

    ProductCategory getProductCategoryById(long id);
}
