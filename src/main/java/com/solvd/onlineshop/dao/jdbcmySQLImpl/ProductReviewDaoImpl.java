package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IProductReviewDao;
import com.solvd.onlineshop.model.product.ProductReview;

import java.util.List;

public class ProductReviewDaoImpl extends BaseDaoImpl<ProductReview> implements IProductReviewDao {

    private List<ProductReview> productReviews;

    public ProductReviewDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(ProductReview entity) {

    }

    @Override
    public void updateEntity(ProductReview entity) {

    }

    @Override
    public ProductReview getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
