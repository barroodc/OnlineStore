package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.ICheckoutCartDao;
import com.solvd.onlineshop.model.checkout.CheckoutCart;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;

public class CheckoutCartDao extends BaseDao<CheckoutCart> implements ICheckoutCartDao {

    private static final Logger logger = LogManager.getLogger(CheckoutCartDao.class);
    protected final static String CHECKOUT_CART_SEQUENCE = "onlinestore_checkout_cart_seq";

    public CheckoutCartDao() {

    }

    public CheckoutCartDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO checkout_cart (user_id, number_of_items, mobile, email," +
            "country, time_created, cart_updated, is_gift VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

    private static final String GET_ONE = "SELECT id, user_id, number_of_items, mobile, email," +
            "country, time_created, cart_updated, is_gift FROM checkout_cart WHERE id = ?";

    private static final String UPDATE = "UPDATE checkout_cart SET user_id = ?, number_of_items = ?, mobile = ?, " +
            "email = ?, country = ?, time_created = ?, cart_updated = ?, is_gift = ? FROM checkout_cart WHERE id = ?";

    private static final String DELETE = "DELETE FROM checkout_cart WHERE id = ?";


    @Override
    public CheckoutCart findById(long id) {
        CheckoutCart checkoutCart = new CheckoutCart();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                checkoutCart.setId(rs.getLong("id"));
                checkoutCart.setUserID(rs.getLong("user_id"));
                checkoutCart.setNumberOfItems(rs.getLong("number_of_items"));
                checkoutCart.setMobile(rs.getString("mobile"));
                checkoutCart.setEmail(rs.getString("email"));
                checkoutCart.setCountry(rs.getString("country"));
                checkoutCart.setTimeCreated(rs.getDate("time_created"));
                checkoutCart.setCartUpdated(rs.getDate("cart_updated"));
                checkoutCart.setIsGift(rs.getBytes("is_gift"));
            }
        }catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return checkoutCart;
    }

    @Override
    public List<CheckoutCart> findAll() {
        return null;
    }

    @Override
    public CheckoutCart update(CheckoutCart dto) {
        CheckoutCart checkoutCart = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setLong(1, dto.getUserID());
            statement.setLong(2, dto.getNumberOfItems());
            statement.setString(3, dto.getMobile());
            statement.setString(4, dto.getEmail());
            statement.setString(5, dto.getCountry());
            statement.setDate(6, dto.getTimeCreated());
            statement.setDate(7, dto.getCartUpdated());
            statement.setBytes(8, dto.getIsGift());
            statement.setLong(9, dto.getId());
            statement.execute();
            checkoutCart = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return checkoutCart;
    }

    @Override
    public CheckoutCart create(CheckoutCart dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setLong(1, dto.getUserID());
            statement.setLong(2, dto.getNumberOfItems());
            statement.setString(3, dto.getMobile());
            statement.setString(4, dto.getEmail());
            statement.setString(5, dto.getCountry());
            statement.setDate(6, dto.getTimeCreated());
            statement.setDate(7, dto.getCartUpdated());
            statement.setBytes(8, dto.getIsGift());
            statement.execute();
            int id = this.getLastVal(CHECKOUT_CART_SEQUENCE);
            return this.findById(id);
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(long id) {
        try(PreparedStatement statement = this.connection.prepareStatement(DELETE);) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CheckoutCart getNumberOfItemsInCart(long numberOfItems) {
        return null;
    }

    @Override
    public CheckoutCart getContactInformation(String mobile, String email, String country) {
        return null;
    }

    @Override
    public CheckoutCart getCartHistory(Date timeCreated, Date cartUpdated) {
        return null;
    }

    @Override
    public void givenAsGift(byte[] isGift) {

    }

    public static void main(String[] args) {
        CheckoutCartDao example = new CheckoutCartDao();
        System.out.println(example);
    }
}
