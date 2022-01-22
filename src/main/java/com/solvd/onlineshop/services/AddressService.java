package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.IAddressDao;
import com.solvd.onlineshop.dao.ICityDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.AddressDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.CityDao;
import com.solvd.onlineshop.model.location.Address;
import com.solvd.onlineshop.services.interfaces.IAddressService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ServiceLoader;

public class AddressService implements IAddressService<Address> {

    private static final Logger LOGGER = LogManager.getLogger(AddressService.class);
    private static final AddressDao addressDao;
    private static Address address;

    static {
        addressDao = new AddressDao();
        address = null;
    }

    @Override
    public Address getAddressByID(long id) {
        try {
           address = (Address) addressDao.getAddressByID(id);
           LOGGER.info(address);
        } catch (Exception e){
            LOGGER.error(e);
        }

        return null;
    }
}
