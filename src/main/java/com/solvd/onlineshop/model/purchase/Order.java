package com.solvd.onlineshop.model.purchase;
import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "userID", "dateOfOrder", "dateOfDelivery", "timeOfDelivery", "placeOfDelivery",
"cityOfDelivery", "postalCode", "country", "mobile", "email", "timeCreated", "status"})

public class Order implements DataTransferObject {
    private Long id;
    private Long userID;
    private Date dateOfOrder;
    private Date dateOfDelivery;
    private Date timeOfDelivery;
    private String placeOfDelivery;
    private String cityOfDelivery;
    private String postalCode;
    private String country;
    private String mobile;
    private String email;
    private Date timeCreated;
    private String status;

    public Order() {

    }

    public Order(Date timeCreated, Date dateOfOrder, Date dateOfDelivery, Date timeOfDelivery, String status) {
        this.timeCreated = timeCreated;
        this.dateOfOrder = dateOfOrder;
        this.dateOfDelivery = dateOfDelivery;
        this.timeOfDelivery = timeOfDelivery;
        this.status = status;
    }

    public Order(String placeOfDelivery, String cityOfDelivery, String postalCode, String country, String mobile, String email) {
      this.placeOfDelivery = placeOfDelivery;
      this.cityOfDelivery = cityOfDelivery;
      this.postalCode = postalCode;
      this.country = country;
      this.mobile = mobile;
      this.email = email;
    }

    public Order(Long id, Long userID, Date dateOfOrder, Date dateOfDelivery, Date timeOfDelivery, String placeOfDelivery, String cityOfDelivery, String postalCode, String country, String firstName, String lastName, String mobile, String email, Date timeCreated, String status) {
        this.id = id;
        this.userID = userID;
        this.dateOfOrder = dateOfOrder;
        this.dateOfDelivery = dateOfDelivery;
        this.timeOfDelivery = timeOfDelivery;
        this.placeOfDelivery = placeOfDelivery;
        this.cityOfDelivery = cityOfDelivery;
        this.postalCode = postalCode;
        this.country = country;
        this.mobile = mobile;
        this.email = email;
        this.timeCreated = timeCreated;
        this.status = status;
    }

    public Order(Long id, Long userID, Date dateOfOrder, Date dateOfDelivery, Date timeOfDelivery, String placeOfDelivery, String cityOfDelivery, String postalCode, String country,  String mobile, String email, Date timeCreated, String status) {
        this.id = id;
        this.userID = userID;
        this.dateOfOrder = dateOfOrder;
        this.dateOfDelivery = dateOfDelivery;
        this.timeOfDelivery = timeOfDelivery;
        this.placeOfDelivery = placeOfDelivery;
        this.cityOfDelivery = cityOfDelivery;
        this.postalCode = postalCode;
        this.country = country;
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

    @XmlElement(name = "placeOfDelivery")
    public String getPlaceOfDelivery() {
        return placeOfDelivery;
    }

    public void setPlaceOfDelivery(String placeOfDelivery) {
        this.placeOfDelivery = placeOfDelivery;
    }

    @XmlElement(name = "cityOfDelivery")
    public String getCityOfDelivery() {
        return cityOfDelivery;
    }

    public void setCityOfDelivery(String cityOfDelivery) {
        this.cityOfDelivery = cityOfDelivery;
    }

    @XmlElement(name = "postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @XmlElement(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userID=" + userID +
                ", dateOfOrder=" + dateOfOrder +
                ", dateOfDelivery=" + dateOfDelivery +
                ", timeOfDelivery=" + timeOfDelivery +
                ", placeOfDelivery='" + placeOfDelivery + '\'' +
                ", cityOfDelivery='" + cityOfDelivery + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", timeCreated=" + timeCreated +
                ", status='" + status + '\'' +
                '}';
    }
}
