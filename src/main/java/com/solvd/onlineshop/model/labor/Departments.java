package com.solvd.onlineshop.model.labor;

import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Departments")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "departmentName"})

public class Departments implements DataTransferObject {
    private Long id;
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

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "departmentName")
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
