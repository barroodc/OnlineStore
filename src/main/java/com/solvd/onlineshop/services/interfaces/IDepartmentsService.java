package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.labor.Departments;

public interface IDepartmentsService<T> {

    Departments getDepartmentById(long id);
}
