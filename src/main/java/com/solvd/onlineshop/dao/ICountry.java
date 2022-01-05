package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.location.Country;

import java.util.List;

public interface ICountry extends IBaseDao<Country>{
    List<Country> getCountryByID(long id);
}
