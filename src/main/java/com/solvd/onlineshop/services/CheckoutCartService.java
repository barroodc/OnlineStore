package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.services.interfaces.ICheckoutCartService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CheckoutCartService implements ICheckoutCartService<CheckoutCart> {


    private static final Logger logger = LogManager.getLogger(CheckoutCartService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<CheckoutCart> checkoutCartList;

    @Override
    public CheckoutCart getCheckoutCartById(long id) {
        CheckoutCart checkoutCart = null;
        AtomicReference<String> select = new AtomicReference<>("select * from checkout_cart where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
             preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long userID = resultSet.getLong("user_id");
                    long numberOfItems = resultSet.getLong("numberOfItems");
                    String mobile = resultSet.getString("mobile");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    Date timeCreated = resultSet.getDate("time_created");
                    Date cartUpdated = resultSet.getDate("cart_updated");
                    byte[] isGift = resultSet.getBytes("is_gift");
                    checkoutCart = new CheckoutCart(id, userID, numberOfItems, mobile, email, country, timeCreated,
                                                                 cartUpdated, isGift);
                    checkoutCartList.add(checkoutCart);
                }

            } catch (Exception e) {
               logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return checkoutCart;

    }

}
