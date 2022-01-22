package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.OrderDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.ProductCategoryDao;
import com.solvd.onlineshop.model.product.ProductCategory;
import com.solvd.onlineshop.model.purchase.Order;
import com.solvd.onlineshop.services.interfaces.IProductCategoryService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ProductCategoryService implements IProductCategoryService<ProductCategory> {

    private static final Logger LOGGER = LogManager.getLogger(ProductCategoryService.class);
    private static final ProductCategoryDao productCategoryDao;
    private static ProductCategory productCategory;

    static {
        productCategoryDao = new ProductCategoryDao();
        productCategory = null;
    }


    @Override
    public ProductCategory getProductCategoryById(long id) {
        try {
            productCategory = (ProductCategory) productCategoryDao.getProductCategoryByID(id);
            LOGGER.info(productCategory);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
