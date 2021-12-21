package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.model.checkout.ItemsInCart;
import com.solvd.onlineshop.dao.IItemsInCartDao;

import java.util.List;

public class ItemsInCartDaoImpl extends BaseDaoImpl<ItemsInCart> implements IItemsInCartDao {

    private List<ItemsInCart> itemsInCarts;

    public ItemsInCartDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(ItemsInCart entity) {

    }

    @Override
    public void updateEntity(ItemsInCart entity) {

    }

    @Override
    public ItemsInCart getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
