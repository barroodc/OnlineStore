package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.labor.Departments;

import java.util.List;

public interface IDepartmentsDao {

    List<Departments> getAllDepartments();
    Departments getDepartmentByID(long id);
    void addDepartment(Departments departments);
    void deleteDepartment(Departments departments);
}
