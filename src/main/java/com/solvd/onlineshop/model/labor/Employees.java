package com.solvd.onlineshop.model.labor;
import java.sql.Date;
public class Employees {
    private Long id;
    private Long jobsID;
    private Long departmentsID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private Date hireDate;
    private String jobID;
    private float Salary;
    private Long managerID;
    private Long departmentID;

    public Employees() {

    }

    public Employees(Long id, Long jobsID, Long departmentsID, String firstName, String lastName, String mobile, String email, Date hireDate, String jobID, float salary, Long managerID, Long departmentID) {
        this.id = id;
        this.jobsID = jobsID;
        this.departmentsID = departmentsID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.hireDate = hireDate;
        this.jobID = jobID;
        Salary = salary;
        this.managerID = managerID;
        this.departmentID = departmentID;
    }

    public Employees(Long id, Long jobsID, Long departmentsID, String firstName, String middleName, String lastName, String mobile, String email, Date hireDate, String jobID, float salary, Long managerID, Long departmentID) {
        this.id = id;
        this.jobsID = jobsID;
        this.departmentsID = departmentsID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.hireDate = hireDate;
        this.jobID = jobID;
        Salary = salary;
        this.managerID = managerID;
        this.departmentID = departmentID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobsID() {
        return jobsID;
    }

    public void setJobsID(Long jobsID) {
        this.jobsID = jobsID;
    }

    public Long getDepartmentsID() {
        return departmentsID;
    }

    public void setDepartmentsID(Long departmentsID) {
        this.departmentsID = departmentsID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public Long getManagerID() {
        return managerID;
    }

    public void setManagerID(Long managerID) {
        this.managerID = managerID;
    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }
}
