package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IProductReviewDao;
import com.solvd.onlineshop.product.ProductReview;

import java.util.List;

public class ProductReviewDaoImpl implements IProductReviewDao {

    private List<ProductReview> productReviews;

    public ProductReviewDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<ProductReview> getAllProductReviews() {
        return null;
    }

    @Override
    public ProductReview getProductReviewByID(Long id) {
        return null;
    }

    @Override
    public void updateProductReview(ProductReview productReview) {

    }

    @Override
    public void deleteProductReview(ProductReview productReview) {

    }
}
