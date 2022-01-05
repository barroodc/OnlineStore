package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.location.Address;

import java.util.List;

public interface IAddress extends IBaseDao<Address> {
    List<Address> getAddressByID(long id);
}
