package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IProductDao;
import com.solvd.onlineshop.product.Product;

import java.util.List;

public class ProductDaoImpl implements IProductDao {

    private List<Product> products;

    public ProductDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductsByID(Long id) {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }
}
