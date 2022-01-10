package com.solvd.onlineshop.services;

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

    private static final Logger logger = LogManager.getLogger(ProductReviewService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<ProductReview> productReviewList;


    @Override
    public ProductReview getProductReviewById(long id) {
        ProductReview productReview = null;
        AtomicReference<String> select = new AtomicReference<>("select * from product_review where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long productID = resultSet.getLong("product_id");
                    float overallRating = resultSet.getFloat("overall_rating");
                    String title = resultSet.getString("title");
                    long parentID = resultSet.getLong("parent_id");
                    Date timeCreated = resultSet.getDate("time_created");
                    String userReview = resultSet.getString("user_review");
                    productReview = new ProductReview(id, productID, overallRating, title, parentID, timeCreated, userReview);
                    productReviewList.add(productReview);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return productReview;
    }
}
