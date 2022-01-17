package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.model.location.Country;

import java.sql.Date;
import java.util.List;


public interface ICheckoutCartDao extends IBaseDao<CheckoutCart> {
    List<CheckoutCart> getCheckoutCartByID(long id);
}
