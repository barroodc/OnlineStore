package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.labor.Departments;
import com.solvd.onlineshop.model.location.Country;
import com.solvd.onlineshop.services.interfaces.IDepartmentsService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class DepartmentsService implements IDepartmentsService<Departments> {

    private static final Logger logger = LogManager.getLogger(DepartmentsService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Departments> departmentsList;


    @Override
    public Departments getDepartmentById(long id) {
        Departments departments = null;
        AtomicReference<String> select = new AtomicReference<>("select * from departments where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    String departmentName = resultSet.getString("department_name");
                    departments = new Departments(id, departmentName);
                    departmentsList.add(departments);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return departments;
    }
}
