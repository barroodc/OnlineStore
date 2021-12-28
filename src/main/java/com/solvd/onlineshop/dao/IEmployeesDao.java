package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.labor.Employees;

import java.sql.Date;
import java.util.List;
import java.util.Map;


public interface IEmployeesDao extends IBaseDao<Employees> {

    List<Employees> getAllEmployees(long id);
    Employees getContactInformation(String firstName, String lastName, String mobile, String email);
    Map<String, Date> nameAndHireDate();
    Map<String, Float>nameAndSalary();
}
