package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.product.ProductReview;

import java.util.List;

public interface IProductReviewDao {
    List<ProductReview> getAllProductReviews();
    ProductReview getProductReviewByID(long id);
    void updateProductReview(ProductReview productReview);
    void deleteProductReview(ProductReview productReview);
}
