package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.model.checkout.ItemsInCart;
import com.solvd.onlineshop.dao.IItemsInCartDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class ItemsInCartDao extends BaseDao<ItemsInCart> implements IItemsInCartDao {

    private static final Logger logger = LogManager.getLogger(ItemsInCartDao.class);
    protected final static String ITEMS_IN_CART_SEQUENCE = "onlinestore_items_in_cart_seq";


    public ItemsInCartDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO items_in_Cart (product_id, product_name, sku, " +
            "price, subtotalOfItems, discount, quantity, time_created, cart_updated) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

    private static final String FINDBYID = "SELECT items_in_cart_id, product_id, product_name, sku, " +
            "price, subtotalOfItems, discount, quantity, time_created, cart_updated FROM items_in_cart WHERE items_in_cart_id = ?";

    private static final String UPDATE = "UPDATE items_in_cart SET product_id = ?, product_name = ?, " +
            "sku = ?, price = ?, subtotalOfItems = ?, discount = ?, quantity = ?, time_created = ?, cart_updated = ? FROM " +
            "items_in_cart  WHERE items_in_cart_id = ?";

    private static final String DELETE = "DELETE FROM items_in_cart WHERE items_in_cart_id = ?";

    @Override
    public ItemsInCart findById(long id) {
        ItemsInCart itemsInCart = new ItemsInCart();
        try(PreparedStatement statement = this.connection.prepareStatement(FINDBYID);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                itemsInCart.setId(rs.getLong("items_in_cart_id"));
                itemsInCart.setProductID(rs.getLong("product_id"));
                itemsInCart.setProductName(rs.getString("product_name"));
                itemsInCart.setSku(rs.getString("sku"));
                itemsInCart.setPrice(rs.getFloat("price"));
                itemsInCart.setSubtotalOfItems(rs.getLong("subtotalOfItems"));
                itemsInCart.setDiscount(rs.getFloat("discount"));
                itemsInCart.setQuantity(rs.getFloat("quantity"));
                itemsInCart.setTimeCreated(rs.getDate("time_created"));
                itemsInCart.setCartUpdated(rs.getDate("cart_updated"));

            }
        }catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return itemsInCart;
    }

    @Override
    public List<ItemsInCart> findAll() {
        return null;
    }

    @Override
    public ItemsInCart update(ItemsInCart dto) {
        ItemsInCart itemsInCart = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setLong(1, dto.getProductID());
            statement.setString(2, dto.getProductName());
            statement.setString(3, dto.getSku());
            statement.setFloat(4, dto.getPrice());
            statement.setFloat(5, dto.getSubtotalOfItems());
            statement.setFloat(6, dto.getDiscount());
            statement.setFloat(7, dto.getQuantity());
            statement.setDate(8, dto.getTimeCreated());
            statement.setDate(9, dto.getCartUpdated());
            statement.setLong(10, dto.getId());
            statement.execute();
            itemsInCart = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return itemsInCart;
    }

    @Override
    public ItemsInCart create(ItemsInCart dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setLong(1, dto.getProductID());
            statement.setString(2, dto.getProductName());
            statement.setString(3, dto.getSku());
            statement.setFloat(4, dto.getPrice());
            statement.setFloat(5, dto.getSubtotalOfItems());
            statement.setFloat(6, dto.getDiscount());
            statement.setFloat(7, dto.getQuantity());
            statement.setDate(8, dto.getTimeCreated());
            statement.setDate(9, dto.getCartUpdated());
            statement.execute();
            int id = this.getLastVal(ITEMS_IN_CART_SEQUENCE);
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
    public Map<String, Float> productAndPrice() {
        return null;
    }

    @Override
    public ItemsInCart getSubtotalWithoutDiscount(float subtotalOfItems) {
        return null;
    }

    @Override
    public ItemsInCart getSubtotalWithDiscount(float subtotalOfItems, float quantity, float discount) {
        return null;
    }

    @Override
    public ItemsInCart getCartHistory(Date timeCreated, Date cartUpdated) {
        return null;
    }
}
