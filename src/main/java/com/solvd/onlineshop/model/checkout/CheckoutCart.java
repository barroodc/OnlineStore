package com.solvd.onlineshop.model.checkout;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.sql.Date;
import java.util.Arrays;

@XmlRootElement(name = "CheckoutCart")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "userID", "numberOfItems", "mobile", "email", "country",
"timeCreated","cartUpdated", "isGift"})


public class CheckoutCart {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("userID")
    private Long userID;
    @JsonProperty("numberOfItems")
    private long numberOfItems;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("email")
    private String email;
    @JsonProperty("country")
    private String country;
    @JsonProperty("timeCreated")
    private Date timeCreated;
    @JsonProperty("cartUpdated")
    private Date cartUpdated;
    @JsonProperty("isGift")
    private byte[] isGift;




    public CheckoutCart() {

    }


    public CheckoutCart(byte[] gift) {
        this.isGift = gift;
    }

    public CheckoutCart(long numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public CheckoutCart(Date timeCreated, Date cartUpdated) {
        this.timeCreated = timeCreated;
        this.cartUpdated = cartUpdated;
    }

    public CheckoutCart(String mobile, String email, String country) {
      this.mobile = mobile;
      this.email = email;
      this.country = country;
    }

    public CheckoutCart(Long id, Long userID, long numberOfItems, String mobile, String email, String country, Date timeCreated, Date cartUpdated, byte[] isGift) {
        this.id = id;
        this.userID = userID;
        this.numberOfItems = numberOfItems;
        this.mobile = mobile;
        this.email = email;
        this.country = country;
        this.timeCreated = timeCreated;
        this.cartUpdated = cartUpdated;
        this.isGift = isGift;
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

    @XmlElement(name = "numberOfItems")
    public long getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(long numberOfItems) {
        this.numberOfItems = numberOfItems;
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

    @XmlElement(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlElement(name = "timeCreated")
    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    @XmlElement(name = "cartUpdated")
    public Date getCartUpdated() {
        return cartUpdated;
    }

    public void setCartUpdated(Date cartUpdated) {
        this.cartUpdated = cartUpdated;
    }

    @XmlElement(name = "isGift")
    public byte[] getIsGift() {
        return isGift;
    }

    public void setIsGift(byte[] isGift) {
        this.isGift = isGift;
    }

    @Override
    public String toString() {
        return "CheckoutCart{" +
                "id=" + id +
                ", userID=" + userID +
                ", numberOfItems=" + numberOfItems +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", timeCreated=" + timeCreated +
                ", cartUpdated=" + cartUpdated +
                ", isGift=" + Arrays.toString(isGift) +
                '}';
    }

}
