package com.solvd.onlineshop.model.labor;
import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "Employees")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "jobs", "departmentsID", "mobile", "email", "hireDate",
"jobsID", "salary", "managerID", "departmentID"})


public class Employees implements DataTransferObject {
    private long id;
    private long jobsID;
    private long departmentsID;
    private String mobile;
    private String email;
    private Date hireDate;
    private String jobID; //look into this one. It does make sense. Consider renaming
    private float salary;
    private long managerID;
    private long departmentID; //look into this one as well. Consider renaming

    public Employees() {

    }


    public Employees(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Employees(float salary) {
        this.salary = salary;
    }

    public Employees(String mobile, String email){
        this.mobile = mobile;
        this.email = email;
    }


    public Employees(long id, long jobsID, long departmentsID, String mobile, String email, Date hireDate, String jobID, float salary, long managerID, long departmentID) {
        this.id = id;
        this.jobsID = jobsID;
        this.departmentsID = departmentsID;
        this.mobile = mobile;
        this.email = email;
        this.hireDate = hireDate;
        this.jobID = jobID;
        this.salary = salary;
        this.managerID = managerID;
        this.departmentID = departmentID;
    }

    @XmlAttribute
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlAttribute
    public long getJobsID() {
        return jobsID;
    }

    public void setJobsID(long jobsID) {
        this.jobsID = jobsID;
    }

    @XmlAttribute
    public long getDepartmentsID() {
        return departmentsID;
    }

    public void setDepartmentsID(long departmentsID) {
        this.departmentsID = departmentsID;
    }

    @XmlElement(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "hireDate")
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @XmlElement(name = "jobID")
    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    @XmlElement(name = "salary")
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @XmlElement(name = "managerID")
    public long getManagerID() {
        return managerID;
    }

    public void setManagerID(Long managerID) {
        this.managerID = managerID;
    }

    @XmlElement(name = "departmentID")
    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", jobsID=" + jobsID +
                ", departmentsID=" + departmentsID +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", hireDate=" + hireDate +
                ", jobID='" + jobID + '\'' +
                ", salary=" + salary +
                ", managerID=" + managerID +
                ", departmentID=" + departmentID +
                '}';
    }
}
