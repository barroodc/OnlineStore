package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.location.City;


public interface ICityService<T> {
    City getCityByID(long id);
}
