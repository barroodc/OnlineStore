package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.ProductDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.ProductSupplierDao;
import com.solvd.onlineshop.model.product.Product;
import com.solvd.onlineshop.model.product.ProductSupplier;
import com.solvd.onlineshop.services.interfaces.IProductSupplierService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ProductSupplierService implements IProductSupplierService<ProductSupplier> {

    private static final Logger LOGGER = LogManager.getLogger(ProductSupplierService.class);
    private static final ProductSupplierDao productSupplierDao;
    private static ProductSupplier productSupplier;

    static {
        productSupplierDao = new ProductSupplierDao();
        productSupplier = null;
    }

    @Override
    public ProductSupplier getProductSupplierById(long id) {
        try {
            productSupplier = (ProductSupplier) productSupplierDao.getAllProductSuppliersByID(id);
            LOGGER.info(productSupplier);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
