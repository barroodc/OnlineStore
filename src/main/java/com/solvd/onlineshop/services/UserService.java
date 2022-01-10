package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.purchase.Transaction;
import com.solvd.onlineshop.model.user.User;
import com.solvd.onlineshop.services.interfaces.IUserService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class UserService implements IUserService<User> {

    private static final Logger logger = LogManager.getLogger(User.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<User> userList;

    @Override
    public User getUserById(long id) {
        User user = null;
        AtomicReference<String> select = new AtomicReference<>("select * from user where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long employeesID = resultSet.getLong("employees_id");
                    String firstName = resultSet.getString("first_name");
                    String middleName = resultSet.getString("middle_name");
                    String lastName = resultSet.getString("last_name");
                    String mobile = resultSet.getString("mobile");
                    String email = resultSet.getString("email");
                    String password = resultSet.getString("password");
                    String userName = resultSet.getString("user_name");
                    Date timeCreated = resultSet.getDate("time_created");
                    Date lastLogin = resultSet.getDate("last_login");
                    user = new User(id, employeesID, firstName, middleName, lastName, mobile, email, password,
                                    userName, timeCreated, lastLogin);
                    userList.add(user);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return user;
    }
}
