package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IEmployeesDao;
import com.solvd.onlineshop.model.labor.Employees;

import java.util.List;

public class EmployeesDaoImpl extends BaseDaoImpl<Employees> implements IEmployeesDao {

    private List<Employees> employees;

    public EmployeesDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(Employees entity) {

    }

    @Override
    public void updateEntity(Employees entity) {

    }

    @Override
    public Employees getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
