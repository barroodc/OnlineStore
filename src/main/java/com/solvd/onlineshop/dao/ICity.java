package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.location.City;

import java.util.List;

public interface ICity extends IBaseDao<City> {
    List<City> getCityByID(long id);
}
