package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.location.Address;

public interface IAddressService<T> {
    Address getAddressByID(long id);
}
