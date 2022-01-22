package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.ProductDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.ProductReviewDao;
import com.solvd.onlineshop.model.product.Product;
import com.solvd.onlineshop.model.product.ProductReview;
import com.solvd.onlineshop.services.interfaces.IProductService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ProductService implements IProductService<Product> {

    private static final Logger LOGGER = LogManager.getLogger(ProductService.class);
    private static final ProductDao productDao;
    private static Product product;

    static {
        productDao = new ProductDao();
        product = null;
    }


    @Override
    public Product getProductById(long id) {
        try {
            product = (Product) productDao.getProductByID(id);
            LOGGER.info(product);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
