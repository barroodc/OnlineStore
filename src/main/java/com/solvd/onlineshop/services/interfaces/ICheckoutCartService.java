package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.checkout.CheckoutCart;

public interface ICheckoutCartService<T> {

    CheckoutCart getCheckoutCartById(long id) throws Exception;
}
