package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.checkout.ItemsInCart;

public interface IItemsInCartService {

    ItemsInCart getItemsInCartById(long id);
}
