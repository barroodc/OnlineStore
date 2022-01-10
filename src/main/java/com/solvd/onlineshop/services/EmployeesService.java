package com.solvd.onlineshop.services;

import com.solvd.onlineshop.model.labor.Departments;
import com.solvd.onlineshop.model.labor.Employees;
import com.solvd.onlineshop.model.location.City;
import com.solvd.onlineshop.services.interfaces.IEmployeesService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class EmployeesService implements IEmployeesService<Employees> {

    private static final Logger logger = LogManager.getLogger(EmployeesService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Employees> employeesList;

    @Override
    public Employees getEmployeesById(long id) {
        Employees employees = null;
        AtomicReference<String> select = new AtomicReference<>("select * from employees where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long jobsID = resultSet.getLong("jobs_id");
                    Long departmentsID = resultSet.getLong("departments_id");
                    String mobile = resultSet.getString("mobile");
                    String email = resultSet.getString("email");
                    Date hireDate = resultSet.getDate("hire_date");
                    String jobID = resultSet.getString("job_id");
                    float salary = resultSet.getFloat("salary");
                    Long managerID = resultSet.getLong("manager_id");
                    Long departmentID = resultSet.getLong("department_id");
                    employees = new Employees(id, jobsID, departmentsID, mobile, email, hireDate, jobID, salary, managerID, departmentID);
                    employeesList.add(employees);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return employees;
    }
}
