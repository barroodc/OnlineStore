package com.solvd.onlineshop.model.purchase;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "userID", "dateOfOrder", "dateOfDelivery", "timeOfDelivery", "mobile",
        "email", "timeCreated", "status"})

public class Order {
    private Long id;
    private Long userID;
    private Date dateOfOrder;
    private Date dateOfDelivery;
    private Date timeOfDelivery;
    private String mobile;
    private String email;
    private Date timeCreated;
    private String status;

    public Order() {

    }

    public Order(String mobile, String email) {
        this.mobile = mobile;
        this.email = email;
    }

    public Order(Date timeCreated, Date dateOfOrder, Date dateOfDelivery, Date timeOfDelivery, String status) {
        this.timeCreated = timeCreated;
        this.dateOfOrder = dateOfOrder;
        this.dateOfDelivery = dateOfDelivery;
        this.timeOfDelivery = timeOfDelivery;
        this.status = status;
    }

    public Order(Long id, Long userID, Date dateOfOrder, Date dateOfDelivery, Date timeOfDelivery, String mobile, String email, Date timeCreated, String status) {
        this.id = id;
        this.userID = userID;
        this.dateOfOrder = dateOfOrder;
        this.dateOfDelivery = dateOfDelivery;
        this.timeOfDelivery = timeOfDelivery;
        this.mobile = mobile;
        this.email = email;
        this.timeCreated = timeCreated;
        this.status = status;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    @XmlElement(name = "dateOfOrder")
    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    @XmlElement(name = "dateOfDelivery")
    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    @XmlElement(name = "timeOfDelivery")
    public Date getTimeOfDelivery() {
        return timeOfDelivery;
    }

    public void setTimeOfDelivery(Date timeOfDelivery) {
        this.timeOfDelivery = timeOfDelivery;
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

    @XmlElement(name = "timeCreated")
    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    @XmlElement(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userID=" + userID +
                ", dateOfOrder=" + dateOfOrder +
                ", dateOfDelivery=" + dateOfDelivery +
                ", timeOfDelivery=" + timeOfDelivery +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", timeCreated=" + timeCreated +
                ", status='" + status + '\'' +
                '}';
    }
}
