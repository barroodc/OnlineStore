package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.product.ProductReview;

public interface IProductReviewService<T> {

    ProductReview getProductReviewById(long id);
}
