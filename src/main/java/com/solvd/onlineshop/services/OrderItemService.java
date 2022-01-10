package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.labor.Jobs;
import com.solvd.onlineshop.model.purchase.OrderItem;
import com.solvd.onlineshop.services.interfaces.IOrderItemService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class OrderItemService implements IOrderItemService<OrderItem> {

    private static final Logger logger = LogManager.getLogger(OrderItemService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<OrderItem> orderItemList;

    @Override
    public OrderItem getOrderItemById(long id) {
        OrderItem orderItem = null;
        AtomicReference<String> select = new AtomicReference<>("select * from order_item where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long orderID= resultSet.getLong("order_id");
                    Long productID = resultSet.getLong("product_id");
                    String sku = resultSet.getString("sku");
                    float price = resultSet.getFloat("price");
                    float discount = resultSet.getFloat("discount");
                    long quantity = resultSet.getLong("quantity");
                    Date timeCreated = resultSet.getDate("time_created");
                    orderItem = new OrderItem(id, orderID, productID, sku, price, discount, quantity, timeCreated);
                    orderItemList.add(orderItem);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return orderItem;
    }
}
