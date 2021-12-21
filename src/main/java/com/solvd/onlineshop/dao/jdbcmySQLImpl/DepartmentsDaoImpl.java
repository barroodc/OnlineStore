package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IDepartmentsDao;
import com.solvd.onlineshop.model.labor.Departments;

import java.util.List;

public class DepartmentsDaoImpl extends BaseDaoImpl<Departments> implements IDepartmentsDao {

    private List<Departments> departments;

    public DepartmentsDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(Departments entity) {

    }

    @Override
    public void updateEntity(Departments entity) {

    }

    @Override
    public Departments getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
