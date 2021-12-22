package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.labor.Departments;

import java.util.List;


public interface IDepartmentsDao extends IBaseDao<Departments> {
      List<Departments> getAllDepartments();
}
