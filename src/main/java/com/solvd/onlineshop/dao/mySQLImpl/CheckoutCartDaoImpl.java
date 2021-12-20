package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.checkout.CheckoutCart;
import com.solvd.onlineshop.dao.ICheckoutCartDao;

import java.util.List;

public class CheckoutCartDaoImpl implements ICheckoutCartDao {

    private List<CheckoutCart> checkoutCarts;

    public CheckoutCartDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<CheckoutCart> getAllCheckoutCarts() {
        return null;
    }

    @Override
    public CheckoutCart getCheckoutCartByID(long id) {
        return null;
    }

    @Override
    public void updateCheckoutCart(CheckoutCart checkoutCart) {

    }

    @Override
    public void deleteCheckoutCart(CheckoutCart checkoutCart) {

    }
}
