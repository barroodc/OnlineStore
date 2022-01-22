package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.InvoiceDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.ItemsInCartDao;
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

    private static final Logger LOGGER = LogManager.getLogger(ItemsInCartService.class);
    private static final ItemsInCartDao itemsInCartDao;
    private static ItemsInCart itemsInCart;

    static {
        itemsInCartDao = new ItemsInCartDao();
        itemsInCart = null;
    }

    @Override
    public ItemsInCart getItemsInCartById(long id) {
        try {
            itemsInCart = (ItemsInCart) itemsInCartDao.getAllItemsByID(id);
            LOGGER.info(itemsInCart);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
