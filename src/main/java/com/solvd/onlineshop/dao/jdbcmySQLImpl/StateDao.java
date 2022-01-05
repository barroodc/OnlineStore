package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IState;
import com.solvd.onlineshop.model.location.State;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StateDao extends BaseDao<State> implements IState {

    private static final Logger logger = LogManager.getLogger(StateDao.class);
    protected final static String STATE_SEQUENCE = "onlinestore_state_seq";

    public StateDao() {

    }

    public StateDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO state (country_id, state_name, last_update) VALUES (?, ?, ?)";

    private static final String GET_ONE = "SELECT id, country_id, state_name, last_update FROM state WHERE id = ?";

    private static final String UPDATE = "UPDATE state SET country_id = ?, state_name = ?, last_update FROM state WHERE id = ?";

    private static final String DELETE = "DELETE FROM state WHERE id = ?";

    @Override
    public State findById(long id) {
        State state = new State();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);){
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                state.setId(rs.getLong("id"));
                state.setCountryID(rs.getLong("country_id"));
                state.setStateName(rs.getString("state_name"));
                state.setLastUpdate(rs.getTimestamp("last_update"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return state;
    }

    @Override
    public List<State> findAll() {
        return null;
    }

    @Override
    public State update(State dto) {
        State state = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setLong(1, dto.getCountryID());
            statement.setString(2, dto.getStateName());
            statement.setTimestamp(3, dto.getLastUpdate());
            statement.setLong(4, dto.getId());
            statement.execute();
            state = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return state;
    }

    @Override
    public State create(State dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setLong(1, dto.getCountryID());
            statement.setString(2, dto.getStateName());
            statement.setTimestamp(3, dto.getLastUpdate());
            statement.execute();
            int id = this.getLastVal(STATE_SEQUENCE);
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
    public List<State> getStateByID(long id) {
        return null;
    }
}
