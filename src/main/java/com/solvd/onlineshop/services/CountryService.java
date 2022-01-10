package com.solvd.onlineshop.services;
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

    private static final Logger logger = LogManager.getLogger(CountryService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Country> countryList;

    @Override
    public Country getCountryByID(long id) {
        Country country = null;
        AtomicReference<String> select = new AtomicReference<>("select * from country where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    String countryName = resultSet.getString("country_name");
                    String currencyName = resultSet.getString("currency_name");
                    String phoneCode = resultSet.getString("phone_code");
                    Timestamp lastUpdate = resultSet.getTimestamp("last_update");
                    country = new Country(id, countryName, currencyName, phoneCode, lastUpdate);
                    countryList.add(country);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

       return country;
    }
}
