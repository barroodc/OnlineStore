package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.checkout.ItemsInCart;

import java.sql.Date;
import java.util.Map;


public interface IItemsInCartDao extends IBaseDao<ItemsInCart> {

    Map<String, Float> productAndPrice();
    ItemsInCart getSubtotalWithoutDiscount(float subtotalOfItems);
    ItemsInCart getSubtotalWithDiscount(float subtotalOfItems, float quantity, float discount);
    ItemsInCart getCartHistory(Date timeCreated, Date cartUpdated);
}
