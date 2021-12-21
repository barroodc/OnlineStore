package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.dao.ICheckoutCartDao;

import java.util.List;

public class CheckoutCartDaoImpl extends BaseDaoImpl<CheckoutCart> implements ICheckoutCartDao {

    private List<CheckoutCart> checkoutCarts;

    public CheckoutCartDaoImpl() {
        //arraylist will be initialized here.
    }


    @Override
    public void createEntity(CheckoutCart entity) {

    }

    @Override
    public void updateEntity(CheckoutCart entity) {

    }

    @Override
    public CheckoutCart getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
