package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IDepartmentsDao;
import com.solvd.onlineshop.labor.Departments;

import java.util.List;

public class DepartmentsDaoImpl implements IDepartmentsDao {

    private List<Departments> departments;

    public DepartmentsDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<Departments> getAllDepartments() {
        return null;
    }

    @Override
    public Departments getDepartmentByID(long id) {
        return null;
    }

    @Override
    public void addDepartment(Departments departments) {

    }

    @Override
    public void deleteDepartment(Departments departments) {

    }
}
