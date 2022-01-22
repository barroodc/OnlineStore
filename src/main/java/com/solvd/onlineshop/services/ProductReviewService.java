package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.ProductCategoryDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.ProductReviewDao;
import com.solvd.onlineshop.model.product.ProductCategory;
import com.solvd.onlineshop.model.product.ProductReview;
import com.solvd.onlineshop.services.interfaces.IProductReviewService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ProductReviewService implements IProductReviewService<ProductReview> {

    private static final Logger LOGGER = LogManager.getLogger(ProductReviewService.class);
    private static final ProductReviewDao productReviewDao;
    private static ProductReview productReview;

    static {
        productReviewDao = new ProductReviewDao();
        productReview = null;
    }

    @Override
    public ProductReview getProductReviewById(long id) {
        try {
            productReview = (ProductReview) productReviewDao.getAllProductReviewsByID(id);
            LOGGER.info(productReview);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
