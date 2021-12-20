package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.checkout.ItemsInCart;

import java.util.List;

public interface IItemsInCartDao {

    List<ItemsInCart> getAllItems();
    ItemsInCart getItemsByID(Long id);
    void saveItemsInCart(ItemsInCart itemsInCart);
    void deleteItemsInCart(ItemsInCart itemsInCart);
}
