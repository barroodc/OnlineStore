package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.product.ProductCategory;
import com.solvd.onlineshop.model.purchase.Order;
import com.solvd.onlineshop.services.interfaces.IProductCategoryService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ProductCategoryService implements IProductCategoryService<ProductCategory> {

    private static final Logger logger = LogManager.getLogger(ProductCategoryService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<ProductCategory> productCategoryList;


    @Override
    public ProductCategory getProductCategoryById(long id) {
        ProductCategory productCategory = null;
        AtomicReference<String> select = new AtomicReference<>("select * from product_category where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long productID = resultSet.getLong("product_id");
                    String title = resultSet.getString("title");
                    String metaTitle = resultSet.getString("meta_title");
                    String productName = resultSet.getString("product_name");
                    productCategory = new ProductCategory(id, productID, title, metaTitle, productName);
                    productCategoryList.add(productCategory);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return productCategory;
    }
}
