package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.location.City;

import java.util.List;

public interface ICityDao extends IBaseDao<City> {
    List<City> getCityByID(long id);
}
