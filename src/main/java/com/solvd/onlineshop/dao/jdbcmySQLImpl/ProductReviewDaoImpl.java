package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IProductReviewDao;
import com.solvd.onlineshop.model.product.ProductReview;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class ProductReviewDaoImpl extends BaseDaoImpl<ProductReview> implements IProductReviewDao {

    private List<ProductReview> productReviews;

    public ProductReviewDaoImpl() {

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

    @Override
    public Map<String, Float> titleAndRating() {
        return null;
    }

    @Override
    public Map<Float, String> ratingAndUserReview() {
        return null;
    }

    @Override
    public Map<String, Date> titleAndTimeStamp() {
        return null;
    }
}
