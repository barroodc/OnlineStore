package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.checkout.ItemsInCart;
import com.solvd.onlineshop.model.purchase.Invoice;

import java.sql.Date;
import java.util.List;
import java.util.Map;


public interface IItemsInCartDao extends IBaseDao<ItemsInCart> {
    List<ItemsInCart> getAllItemsByID(long id);
}
