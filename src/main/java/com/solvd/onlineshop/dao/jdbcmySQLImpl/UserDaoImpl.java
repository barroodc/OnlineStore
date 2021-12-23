package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.Main;
import com.solvd.onlineshop.dao.IUserDao;
import com.solvd.onlineshop.model.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao, Serializable {

    private static final Logger logger = LogManager.getLogger(UserDaoImpl.class);

    private List<User> users;

    public UserDaoImpl() {
        users = new ArrayList<>();
        User user = new User("Chris","Paul","Barrood","7327354409");
        users.add(user);
    }

    public void serializationExample() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serializationexample.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
        } catch (IOException e) {
           logger.error(e);
        }

        //deserialization

        User chris = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("serializationexample.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            chris = (User) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch(IOException | ClassNotFoundException e) {
             logger.error(e);
        }
    }

    @Override
    public void createEntity(User entity) {

    }

    @Override
    public void updateEntity(User entity) {

    }

    @Override
    public User getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

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
