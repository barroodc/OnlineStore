package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.checkout.CheckoutCart;

import java.util.List;

public interface ICheckoutCartDao {

    List<CheckoutCart> getAllCheckoutCarts();
    CheckoutCart getCheckoutCartByID(Long id);
    void updateCheckoutCart(CheckoutCart checkoutCart);
    void deleteCheckoutCart(CheckoutCart checkoutCart);
}
