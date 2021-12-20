package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.labor.Employees;

import java.util.List;

public interface IEmployeesDao {

    List<Employees> getAllEmployees();
    Employees getEmployeeByID(Long id);
    void addEmployee(Employees employees);
    void deleteEmployee(Employees employees);
}
