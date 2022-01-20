package com.solvd.onlineshop.model.labor;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Departments")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "departmentName"})

public class Departments {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("departmentName")
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
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
