package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.dao.ICheckoutCartDao;

import java.sql.Date;
import java.util.List;

public class CheckoutCartDaoImpl extends BaseDaoImpl<CheckoutCart> implements ICheckoutCartDao {

    private List<CheckoutCart> checkoutCarts;

    public CheckoutCartDaoImpl() {

    }


    @Override
    public void createEntity(CheckoutCart entity) {

    }

    @Override
    public void updateEntity(CheckoutCart entity) {

    }

    @Override
    public CheckoutCart getEntityById(long id) {
        return null;
    }

    @Override
    public void deleteEntity(long id) {

    }

    @Override
    public CheckoutCart getNumberOfItemsInCart(long numberOfItems) {
        return null;
    }

    @Override
    public CheckoutCart getContactInformation(String mobile, String email, String country) {
        return null;
    }

    @Override
    public CheckoutCart getCartHistory(Date timeCreated, Date cartUpdated) {
        return null;
    }

    @Override
    public void givenAsGift(byte[] isGift) {
        
    }
}
