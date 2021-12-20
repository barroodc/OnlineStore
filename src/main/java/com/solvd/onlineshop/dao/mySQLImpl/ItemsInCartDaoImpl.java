package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.checkout.ItemsInCart;
import com.solvd.onlineshop.dao.IItemsInCartDao;

import java.util.List;

public class ItemsInCartDaoImpl implements IItemsInCartDao {

    private List<ItemsInCart> itemsInCarts;

    public ItemsInCartDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<ItemsInCart> getAllItems() {
        return null;
    }

    @Override
    public ItemsInCart getItemsByID(long id) {
        return null;
    }

    @Override
    public void saveItemsInCart(ItemsInCart itemsInCart) {

    }

    @Override
    public void deleteItemsInCart(ItemsInCart itemsInCart) {

    }
}
