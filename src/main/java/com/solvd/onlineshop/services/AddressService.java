package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.location.Address;
import com.solvd.onlineshop.services.interfaces.IAddressService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;


public class AddressService implements IAddressService<Address> {

    private static final Logger logger = LogManager.getLogger(AddressService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Address> addressList;


    @Override
    public Address getAddressByID(long id) {
        Address address = null;
        AtomicReference<String> select = new AtomicReference<>("select * from city where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long cityID = resultSet.getLong("city_id");
                    String streetAddress = resultSet.getString("street_address");
                    String buildingNumber = resultSet.getString("building_number");
                    Timestamp lastUpdate = resultSet.getTimestamp("last_update");
                    address = new Address(id, cityID, streetAddress, buildingNumber, lastUpdate);
                    addressList.add(address);
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return address;
    }
}
