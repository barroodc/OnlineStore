package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.labor.Departments;

import java.util.List;

public interface IDepartmentsDao {

    List<Departments> getAllDepartments();
    Departments getDepartmentByID(Long id);
    void addDepartment(Departments departments);
    void deleteDepartment(Departments departments);
}
