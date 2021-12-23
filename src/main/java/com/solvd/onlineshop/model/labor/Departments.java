package com.solvd.onlineshop.model.labor;

public class Departments {
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
}
