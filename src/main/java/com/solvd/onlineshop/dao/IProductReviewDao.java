package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.ProductReview;

import java.sql.Date;
import java.util.Map;


public interface IProductReviewDao extends IBaseDao<ProductReview>{
    Map<String, Float> titleAndRating();
    Map<Float, String> ratingAndUserReview();
    Map<String, Date> titleAndTimeStamp();
}
