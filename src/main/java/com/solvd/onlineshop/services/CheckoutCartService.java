package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.services.interfaces.ICheckoutCartService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicReference;

public class CheckoutCartService implements ICheckoutCartService<CheckoutCart> {

    private static final Logger logger = LogManager.getLogger(CheckoutCartService.class);
    private static PreparedStatement preparedStatement;



    @Override
    public CheckoutCart getCheckoutCartById(long id) {
        CheckoutCart checkoutCart = null;
        AtomicReference<String> select = new AtomicReference<>("select * from checkout_cart where id = ?");
        try (Connection connection = ConnectionPool.getConnection()) {
            preparedStatement = connection.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
        } catch (Exception e) {
            logger.error(e);
        }

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                checkoutCart = new CheckoutCart(resultSet.getString("id"), resultSet.getString("mobile"), resultSet.getString("email"));
            }
        } catch (Exception e) {
            logger.error(e);
        }
        return checkoutCart;

    }

    public static Vector<CheckoutCart> retrieveAllCheckoutCartServices(){
        Vector<CheckoutCart> checkoutCartList = new Vector<>();
        AtomicReference<String> select = new AtomicReference<>("select * from checkout_cart");
        try (Connection c = ConnectionPool.getConnection()) {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(select.get());

            while (rs.next()) {
                String id = rs.getString("id");
                String mobile = rs.getString("mobile");
                String email = rs.getString("email");
                CheckoutCart checkoutCart = new CheckoutCart(id, mobile, email);
                checkoutCartList.add(checkoutCart);
            }
        } catch (Exception e) {
            logger.error(e);
        }
        return checkoutCartList;
    }
}
