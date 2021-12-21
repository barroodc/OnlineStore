package com.solvd.onlineshop.model.user;
import java.sql.Date;

public class User {
    private Long id;
    private Long employeesID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String password;
    private String userName;
    private Date timeCreated;
    private Date lastLogin;

    public User() {

    }

    public User(Long id, Long employeesID, String firstName, String lastName, String mobile, String email, String password, String userName, Date timeCreated, Date lastLogin) {
        this.id = id;
        this.employeesID = employeesID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.timeCreated = timeCreated;
        this.lastLogin = lastLogin;
    }

    public User(Long id, Long employeesID, String firstName, String middleName, String lastName, String mobile, String email, String password, String userName, Date timeCreated, Date lastLogin) {
        this.id = id;
        this.employeesID = employeesID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.timeCreated = timeCreated;
        this.lastLogin = lastLogin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeesID() {
        return employeesID;
    }

    public void setEmployeesID(Long employeesID) {
        this.employeesID = employeesID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
