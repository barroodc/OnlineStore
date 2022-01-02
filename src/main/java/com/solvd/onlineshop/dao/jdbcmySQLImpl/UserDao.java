package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IUserDao;
import com.solvd.onlineshop.model.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;

public class UserDao extends BaseDao<User> implements IUserDao {

    private static final Logger logger = LogManager.getLogger(UserDao.class);
    protected final static String USER_SEQUENCE = "onlinestore_user_seq";

    public UserDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO user (first_name, middle_name," +
            "last_name, mobile, email, password, user_name, time_created, last_login) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String FINDBYID = "SELECT user_id, first_name, middle_name, " +
            "last_name, mobile, email, password, user_name, time_created, last_login FROM customer WHERE user_id = ?";

    private static final String UPDATE = "UPDATE user SET first_name = ?, middle_name = ?, " +
            "last_name = ?, mobile = ?, email = ?, password = ?, user_name = ?, time_created = ?, last_login WHERE user_id = ?";

    private static final String DELETE = "DELETE FROM user WHERE user_id = ?";

    public UserDao() {
        super();
    }

    @Override
    public User findById(long id) {
        User user = new User();
        try(PreparedStatement statement = this.connection.prepareStatement(FINDBYID);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                user.setId(rs.getLong("user_id"));
                user.setFirstName(rs.getString("first_name"));
                user.setMiddleName(rs.getString("middle_name"));
                user.setLastName(rs.getString("last_name"));
                user.setMobile(rs.getString("mobile"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setUserName(rs.getString("user_name"));
                user.setTimeCreated(rs.getDate("time_created"));
                user.setLastLogin(rs.getDate("last_login"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User update(User dto) {
        User user = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setString(1, dto.getFirstName());
            statement.setString(2, dto.getMiddleName());
            statement.setString(3, dto.getLastName());
            statement.setString(4, dto.getMobile());
            statement.setString(5, dto.getEmail());
            statement.setString(6, dto.getPassword());
            statement.setString(7, dto.getUserName());
            statement.setDate(8, dto.getTimeCreated());
            statement.setDate(9,dto.getLastLogin());
            statement.setLong(10, dto.getId());
            statement.execute();
            user = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public User create(User dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setString(1, dto.getFirstName());
            statement.setString(2, dto.getMiddleName());
            statement.setString(3, dto.getLastName());
            statement.setString(4, dto.getMobile());
            statement.setString(5, dto.getEmail());
            statement.setString(6, dto.getPassword());
            statement.setString(7, dto.getUserName());
            statement.setDate(8, dto.getTimeCreated());
            statement.setDate(9,dto.getLastLogin());
            statement.execute();
            int id = this.getLastVal(USER_SEQUENCE);
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
    public User getNameAndNumber(String firstName, String middleName, String lastName, String mobile) {
        return null;
    }

    @Override
    public User getAccountInformation(Date timeCreated, String email, String username, String password, Date lastLogin) {
        return null;
    }
}