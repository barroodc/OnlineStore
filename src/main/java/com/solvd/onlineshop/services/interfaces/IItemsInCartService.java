package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.checkout.ItemsInCart;

public interface IItemsInCartService<T> {

    ItemsInCart getItemsInCartById(long id);
}
