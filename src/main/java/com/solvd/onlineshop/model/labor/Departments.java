package com.solvd.onlineshop.model.labor;

public class Departments {
    private Long id;
    private String departmentName;

    public Departments() {

    }

    public Departments(String departmentName) {
       this.departmentName = departmentName;
    }

    public Departments(Long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
