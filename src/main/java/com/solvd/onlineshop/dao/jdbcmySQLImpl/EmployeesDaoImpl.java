package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IEmployeesDao;
import com.solvd.onlineshop.model.labor.Employees;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class EmployeesDaoImpl extends BaseDaoImpl<Employees> implements IEmployeesDao {

    private List<Employees> employee;

    public EmployeesDaoImpl() {

    }

    @Override
    public void createEntity(Employees entity) {

    }

    @Override
    public void updateEntity(Employees entity) {

    }

    @Override
    public Employees getEntityById(long id) {
        return null;
    }

    @Override
    public void deleteEntity(long id) {

    }

    @Override
    public List<Employees> getAllEmployees() {
        return null;
    }

    @Override
    public Employees getContactInformation(String firstName, String lastName, String mobile, String email) {
        return null;
    }

    @Override
    public Map<String, Date> nameAndHireDate() {
        return null;
    }

    @Override
    public Map<String, Float> nameAndSalary() {
        return null;
    }
}
