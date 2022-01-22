package com.solvd.onlineshop.services;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.CheckoutCartDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.CountryDao;
import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.model.location.Country;
import com.solvd.onlineshop.services.interfaces.ICountryService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CountryService implements ICountryService<Country> {

    private static final Logger LOGGER = LogManager.getLogger(CountryService.class);
    private static final CountryDao countryDao;
    private static Country country;

    static {
        countryDao = new CountryDao();
        country = null;
    }
    @Override
    public Country getCountryByID(long id) {
        try {
            country = (Country) countryDao.getCountryByID(id);
            LOGGER.info(country);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
