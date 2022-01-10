package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.checkout.CheckoutCart;
import com.solvd.onlineshop.model.location.City;
import com.solvd.onlineshop.services.interfaces.ICityService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CityService implements ICityService<City> {

    private static final Logger logger = LogManager.getLogger(CityService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<City> cityList;

    @Override
    public City getCityByID(long id) {
        City city = null;
        AtomicReference<String> select = new AtomicReference<>("select * from city where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long countryID = resultSet.getLong("country_id");
                    String cityName = resultSet.getString("city_name");
                    byte[] location = resultSet.getBytes("location");
                    String postalCode = resultSet.getString("postal_code");
                    Timestamp lastUpdate = resultSet.getTimestamp("last_update");
                    city = new City(id, countryID, cityName, location, postalCode, lastUpdate);
                    cityList.add(city);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return city;
    }
}
