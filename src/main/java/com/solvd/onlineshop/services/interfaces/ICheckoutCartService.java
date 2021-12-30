package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.checkout.CheckoutCart;

public interface ICheckoutCartService {

    CheckoutCart getCheckoutCartById(long id);
}
