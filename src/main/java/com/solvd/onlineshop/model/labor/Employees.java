package com.solvd.onlineshop.model.labor;
import java.sql.Date;
public class Employees {
    private long id;
    private long jobsID;
    private long departmentsID;
    private String mobile;
    private String email;
    private Date hireDate;
    private String jobID;
    private float salary;
    private long managerID;
    private long departmentID;

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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getJobsID() {
        return jobsID;
    }

    public void setJobsID(long jobsID) {
        this.jobsID = jobsID;
    }

    public long getDepartmentsID() {
        return departmentsID;
    }

    public void setDepartmentsID(long departmentsID) {
        this.departmentsID = departmentsID;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public long getManagerID() {
        return managerID;
    }

    public void setManagerID(Long managerID) {
        this.managerID = managerID;
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }
}
