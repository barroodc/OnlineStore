package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.labor.Employees;

public interface IEmployeesService<T> {

    Employees getEmployeesById(long id);
}
