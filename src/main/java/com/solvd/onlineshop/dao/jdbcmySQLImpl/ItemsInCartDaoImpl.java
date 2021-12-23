package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.model.checkout.ItemsInCart;
import com.solvd.onlineshop.dao.IItemsInCartDao;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class ItemsInCartDaoImpl extends BaseDaoImpl<ItemsInCart> implements IItemsInCartDao {

    private List<ItemsInCart> itemsInCarts;

    public ItemsInCartDaoImpl() {

    }

    @Override
    public void createEntity(ItemsInCart entity) {

    }

    @Override
    public void updateEntity(ItemsInCart entity) {

    }

    @Override
    public ItemsInCart getEntityById(long id) {
        return null;
    }

    @Override
    public void deleteEntity(long id) {

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
