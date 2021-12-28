package com.solvd.onlineshop.model.labor;

import com.solvd.onlineshop.utils.DataTransferObject;

public class Departments implements DataTransferObject {
    private long id;
    private String departmentName;

    public Departments() {

    }

    public Departments(String departmentName) {
       this.departmentName = departmentName;
    }

    public Departments(long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
