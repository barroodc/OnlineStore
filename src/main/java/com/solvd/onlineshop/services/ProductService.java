package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.product.Product;
import com.solvd.onlineshop.model.product.ProductReview;
import com.solvd.onlineshop.services.interfaces.IProductService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ProductService implements IProductService<Product> {

    private static final Logger logger = LogManager.getLogger(ProductService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Product> productList;

    @Override
    public Product getProductById(long id) {
        Product product = null;
        AtomicReference<String> select = new AtomicReference<>("select * from product where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long inventoryID = resultSet.getLong("inventory_id");
                    long productTypeID = resultSet.getLong("product_type_id");
                    long categoryID = resultSet.getLong("category_id");
                    long marketID = resultSet.getLong("market_id");
                    long shopID = resultSet.getLong("shop_id");
                    long countryID = resultSet.getLong("country_id");
                    String productName = resultSet.getString("product_name");
                    product = new Product(id, inventoryID, productTypeID, categoryID, marketID, shopID,
                                          countryID, productName);
                    productList.add(product);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return product;
    }
}
