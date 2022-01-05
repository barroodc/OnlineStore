package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.ICountry;
import com.solvd.onlineshop.model.location.Country;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CountryDao extends BaseDao<Country>implements ICountry {

    private static final Logger logger = LogManager.getLogger(CountryDao.class);
    protected final static String COUNTRY_SEQUENCE = "onlinestore_country_seq";

    public CountryDao() {

    }

    public CountryDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO country (country_name, currency_name, phone_code, " +
            "last_update) VALUES (?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT id, country_name, currency_name, phone_code, " +
            "last_update FROM country WHERE id = ?";

    private static final String UPDATE = "UPDATE country SET country_name = ?, currency_name = ?, phone_code = ?, " +
            "last_update FROM country WHERE id = ?";

    private static final String DELETE = "DELETE FROM country WHERE id = ?";

    @Override
    public Country findById(long id) {
        Country country = new Country();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);){
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                country.setId(rs.getLong("id"));
                country.setCountryName(rs.getString("country_name"));
                country.setCurrencyName(rs.getString("currency_name"));
                country.setPhoneCode(rs.getString("phone_code"));
                country.setLastUpdate(rs.getTimestamp("last_update"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return country;
    }

    @Override
    public List<Country> findAll() {
        return null;
    }

    @Override
    public Country update(Country dto) {
        Country country = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setString(1, dto.getCountryName());
            statement.setString(2, dto.getCurrencyName());
            statement.setString(3, dto.getPhoneCode());
            statement.setTimestamp(4, dto.getLastUpdate());
            statement.setLong(5, dto.getId());
            statement.execute();
            country = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return country;
    }

    @Override
    public Country create(Country dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setString(1, dto.getCountryName());
            statement.setString(2, dto.getCurrencyName());
            statement.setString(3, dto.getPhoneCode());
            statement.setTimestamp(4, dto.getLastUpdate());
            statement.execute();
            int id = this.getLastVal(COUNTRY_SEQUENCE);
            return this.findById(id);
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(long id) {
        try(PreparedStatement statement = this.connection.prepareStatement(DELETE);) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Country> getCountryByID(long id) {
        return null;
    }
}
