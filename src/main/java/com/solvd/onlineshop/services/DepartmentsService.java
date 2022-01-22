package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.CountryDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.DepartmentsDao;
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

    private static final Logger LOGGER = LogManager.getLogger(DepartmentsService.class);
    private static final DepartmentsDao departmentsDao;
    private static Departments departments;

    static {
        departmentsDao = new DepartmentsDao();
        departments = null;
    }


    @Override
    public Departments getDepartmentById(long id) {
        try {
            departments = (Departments) departmentsDao.getAllDepartments(id);
            LOGGER.info(departments);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
