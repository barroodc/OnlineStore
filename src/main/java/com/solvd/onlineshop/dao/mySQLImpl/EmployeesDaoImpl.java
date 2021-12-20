package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IEmployeesDao;
import com.solvd.onlineshop.labor.Employees;

import java.util.List;

public class EmployeesDaoImpl implements IEmployeesDao {

    private List<Employees> employees;

    public EmployeesDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<Employees> getAllEmployees() {
        return null;
    }

    @Override
    public Employees getEmployeeByID(Long id) {
        return null;
    }

    @Override
    public void addEmployee(Employees employees) {

    }

    @Override
    public void deleteEmployee(Employees employees) {

    }
}
