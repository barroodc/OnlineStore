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

    @Override
    public CheckoutCart getCheckoutCartById(long id) {
        CheckoutCart checkoutCart = null;
        AtomicReference<String> select = new AtomicReference<>("select * from checkout_cart where id = ?");
        try {
            Connection connection = ConnectionPool.getConnection();
            try {
                PreparedStatement ps = connection.prepareStatement(select.get());
                ps.setString(1, String.valueOf(id));
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        checkoutCart = new CheckoutCart(rs.getString("id"), rs.getString("mobile"), rs.getString("email"));
                    }
                } catch (Exception e) {
                    logger.error(e);
                }
            } finally {
                connection.close();
            }
        } catch (Exception e) {
            logger.error(e);
        }

        return checkoutCart;

    }

    public static Vector<CheckoutCart> loadAllSuppliers(){
        Vector<CheckoutCart> checkoutCartList = new Vector<>();
        String select = "select * from checkout_cart";
        try {
            Connection c = ConnectionPool.getConnection();
            try {
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery(select);

                while (rs.next()) {
                    String id = rs.getString("id");
                    String mobile = rs.getString("mobile");
                    String email = rs.getString("email");
                    CheckoutCart checkoutCart = new CheckoutCart(id, mobile, email);
                    checkoutCartList.add(checkoutCart);
                }
            } finally {
                c.close();
            }
        } catch (Exception e) {
            logger.error(e);
        }
        return checkoutCartList;
    }
}
