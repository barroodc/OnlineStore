package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.purchase.Order;
import com.solvd.onlineshop.model.purchase.OrderItem;
import com.solvd.onlineshop.services.interfaces.IOrderService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class OrderService implements IOrderService<Order> {

    private static final Logger logger = LogManager.getLogger(OrderService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Order> orderList;

    @Override
    public Order getOrderById(long id) {
        Order order = null;
        AtomicReference<String> select = new AtomicReference<>("select * from order where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long userID = resultSet.getLong("user_id");
                    Date dateOfOrder = resultSet.getDate("date_of_order");
                    Date dateOfDelivery = resultSet.getDate("date_of_delivery");
                    Date timeOfDelivery = resultSet.getDate("time_of_delivery");
                    String mobile = resultSet.getString("mobile");
                    String email = resultSet.getString("email");
                    Date timeCreated = resultSet.getDate("time_created");
                    String status = resultSet.getString("status");
                    order = new Order(id, userID, dateOfOrder, dateOfDelivery, timeOfDelivery, mobile, email,
                                      timeCreated, status);
                    orderList.add(order);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return order;
    }
}
