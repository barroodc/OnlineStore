package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.Product;
import com.solvd.onlineshop.model.product.ProductCategory;
import com.solvd.onlineshop.model.purchase.Invoice;

import java.util.List;

public interface IProductCategoryDao extends IBaseDao<ProductCategory> {
    List<ProductCategory> getProductCategoryByID(long id);
}
