package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.labor.Employees;
import com.solvd.onlineshop.model.location.Country;
import com.solvd.onlineshop.model.product.Inventory;
import com.solvd.onlineshop.services.interfaces.IInventoryService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class InventoryService implements IInventoryService<Inventory> {

    private static final Logger logger = LogManager.getLogger(InventoryService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Inventory> inventoryList;

    @Override
    public Inventory getInventoryById(long id) {
        Inventory inventory = null;
        AtomicReference<String> select = new AtomicReference<>("select * from inventory where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    String productName = resultSet.getString("product_name");
                    String description = resultSet.getString("description");
                    float price = resultSet.getFloat("price");
                    long amountInStock = resultSet.getLong("amount_in_stock");
                    inventory = new Inventory(id, productName, description, price, amountInStock);
                    inventoryList.add(inventory);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return inventory;
    }
}
