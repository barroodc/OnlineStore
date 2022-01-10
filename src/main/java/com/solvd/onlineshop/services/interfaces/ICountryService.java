package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.location.Country;
import com.solvd.onlineshop.services.CountryService;

public interface ICountryService<T> {
    Country getCountryByID(long id);
}
