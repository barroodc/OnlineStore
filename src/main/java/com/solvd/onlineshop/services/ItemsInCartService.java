package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.checkout.ItemsInCart;
import com.solvd.onlineshop.model.purchase.Invoice;
import com.solvd.onlineshop.services.interfaces.IItemsInCartService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ItemsInCartService implements IItemsInCartService<ItemsInCart> {

    private static final Logger logger = LogManager.getLogger(ItemsInCartService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<ItemsInCart> cartItemsList;

    @Override
    public ItemsInCart getItemsInCartById(long id) {
        ItemsInCart itemsInCart = null;
        AtomicReference<String> select = new AtomicReference<>("select * from items_in_cart where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long productID = resultSet.getLong("product_id");
                    String productName = resultSet.getString("product_name");
                    String sku = resultSet.getString("sku");
                    float price = resultSet.getFloat("price");
                    float subTotalOfItems = resultSet.getByte("subtotal_of_items");
                    float discount = resultSet.getFloat("discount");
                    float quantity = resultSet.getFloat("quantity");
                    Date timeCreated = resultSet.getDate("time_created");
                    Date cartUpdated = resultSet.getDate("cart_updated");
                    itemsInCart = new ItemsInCart(id, productID, productName, sku, price, subTotalOfItems,
                                                  discount, quantity, timeCreated, cartUpdated);
                    cartItemsList.add(itemsInCart);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return itemsInCart;
    }
}
