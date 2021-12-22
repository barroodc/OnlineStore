package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IProductDao;
import com.solvd.onlineshop.model.product.Product;

import java.util.List;

public class ProductDaoImpl extends BaseDaoImpl<Product> implements IProductDao {

    private List<Product> products;

    public ProductDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(Product entity) {

    }

    @Override
    public void updateEntity(Product entity) {

    }

    @Override
    public Product getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

    @Override
    public Product getProductName(String productName) {
        return null;
    }
}
