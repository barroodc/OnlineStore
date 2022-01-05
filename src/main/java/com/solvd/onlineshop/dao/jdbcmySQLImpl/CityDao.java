package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.ICity;
import com.solvd.onlineshop.model.location.City;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CityDao extends BaseDao<City> implements ICity {

    private static final Logger logger = LogManager.getLogger(CityDao.class);
    protected final static String CITY_SEQUENCE = "onlinestore_city_seq";

    public CityDao() {

    }

    public CityDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO city (country_id, city_name, location, " +
            "postal_code, last_update) VALUES (?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT id, country_id, city_name, location, postal_code," +
            "last_update FROM city WHERE id = ?";

    private static final String UPDATE = "UPDATE city SET country_id = ?, city_name = ?, location = ?, " +
            "postal_code = ?, last_update FROM city WHERE id = ?";

    private static final String DELETE = "DELETE FROM city WHERE id = ?";

    @Override
    public City findById(long id) {
        City city = new City();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);){
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                city.setId(rs.getLong("id"));
                city.setCountryID(rs.getLong("country_id"));
                city.setCity(rs.getString("city_name"));
                city.setLocation(rs.getBytes("location"));
                city.setPostalCode(rs.getString("postal_code"));
                city.setLastUpdate(rs.getTimestamp("last_update"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return city;
    }

    @Override
    public List<City> findAll() {
        return null;
    }

    @Override
    public City update(City dto) {
        City city = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setLong(1, dto.getCountryID());
            statement.setString(2, dto.getCityName());
            statement.setBytes(3, dto.getLocation());
            statement.setString(4,dto.getPostalCode());
            statement.setTimestamp(5, dto.getLastUpdate());
            statement.setLong(5, dto.getId());
            statement.execute();
            city = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return city;
    }

    @Override
    public City create(City dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setLong(1, dto.getCountryID());
            statement.setString(2, dto.getCityName());
            statement.setBytes(3, dto.getLocation());
            statement.setString(4,dto.getPostalCode());
            statement.setTimestamp(5, dto.getLastUpdate());
            statement.execute();
            int id = this.getLastVal(CITY_SEQUENCE);
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
    public List<City> getCityByID(long id) {
        return null;
    }
}
