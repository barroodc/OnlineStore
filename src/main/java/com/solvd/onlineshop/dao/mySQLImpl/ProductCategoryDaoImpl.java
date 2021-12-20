package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IProductCategoryDao;
import com.solvd.onlineshop.product.ProductCategory;

import java.util.List;

public class ProductCategoryDaoImpl implements IProductCategoryDao {

    private List<ProductCategory> productCategories;

    public ProductCategoryDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<ProductCategory> getAllProductCategories() {
        return null;
    }

    @Override
    public ProductCategory getProductCategoryByID(long id) {
        return null;
    }

    @Override
    public void updateProductCategory(ProductCategory productCategory) {

    }

    @Override
    public void deleteProductCategory(ProductCategory productCategory) {

    }
}
