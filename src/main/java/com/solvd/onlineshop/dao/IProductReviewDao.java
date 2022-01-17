package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.product.ProductReview;
import com.solvd.onlineshop.model.purchase.Invoice;

import java.sql.Date;
import java.util.List;
import java.util.Map;


public interface IProductReviewDao extends IBaseDao<ProductReview>{
    List<ProductReview> getAllProductReviewsByID(long id);
}
