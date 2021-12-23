package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IProductCategoryDao;
import com.solvd.onlineshop.model.product.ProductCategory;

import java.util.List;

public class ProductCategoryDaoImpl extends BaseDaoImpl<ProductCategory> implements IProductCategoryDao {

    private List<ProductCategory> productCategories;

    public ProductCategoryDaoImpl() {

    }

    @Override
    public void createEntity(ProductCategory entity) {

    }

    @Override
    public void updateEntity(ProductCategory entity) {

    }

    @Override
    public ProductCategory getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

    @Override
    public ProductCategory getProductName(String productName) {
        return null;
    }

    @Override
    public ProductCategory getClassifications(String title, String metaTitle) {
        return null;
    }
}
