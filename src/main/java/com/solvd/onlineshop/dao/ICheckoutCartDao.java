package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.checkout.CheckoutCart;

import java.sql.Date;


public interface ICheckoutCartDao extends IBaseDao<CheckoutCart> {
    CheckoutCart getNumberOfItemsInCart(Long numberOfItems);
    CheckoutCart getContactInformation(String mobile, String email, String country);
    CheckoutCart getCartHistory(Date timeCreated, Date cartUpdated);
    void givenAsGift(byte[] isGift);
}
