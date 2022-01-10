package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.product.Product;
import com.solvd.onlineshop.model.product.ProductSupplier;
import com.solvd.onlineshop.services.interfaces.IProductSupplierService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ProductSupplierService implements IProductSupplierService<ProductSupplier> {

    private static final Logger logger = LogManager.getLogger(ProductSupplierService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<ProductSupplier> productSupplierList;

    @Override
    public ProductSupplier getProductSupplierById(long id) {
        ProductSupplier productSupplier = null;
        AtomicReference<String> select = new AtomicReference<>("select * from product_supplier where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    long productID = resultSet.getLong("product_id");
                    String supplierName = resultSet.getString("supplier_name");
                    String categoryOfProducts = resultSet.getString("category_of_products");
                    productSupplier = new ProductSupplier(id, productID, supplierName, categoryOfProducts);
                    productSupplierList.add(productSupplier);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return productSupplier;
    }
}
