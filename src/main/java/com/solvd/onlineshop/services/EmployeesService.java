package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.DepartmentsDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.EmployeesDao;
import com.solvd.onlineshop.model.labor.Departments;
import com.solvd.onlineshop.model.labor.Employees;
import com.solvd.onlineshop.model.location.City;
import com.solvd.onlineshop.services.interfaces.IEmployeesService;
import com.solvd.onlineshop.utils.ConnectionPool;
import com.solvd.onlineshop.utils.streamhomework.EmployeeAdded;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class EmployeesService implements IEmployeesService<Employees> {

    private static final Logger LOGGER = LogManager.getLogger(EmployeesService.class);
    private static final EmployeesDao employeesDao;
    private static Employees employees;

    static {
        employeesDao = new EmployeesDao();
        employees = null;
    }

    @Override
    public Employees getEmployeesById(long id) {
        try {
            employees = (Employees) employeesDao.getAllEmployees(id);
            LOGGER.info(employees);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
