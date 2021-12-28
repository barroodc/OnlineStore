package com.solvd.onlineshop.model.checkout;
import com.solvd.onlineshop.utils.DataTransferObject;

import java.sql.Date;
import java.util.Arrays;

public class CheckoutCart implements DataTransferObject {
    private long id;
    private long userID;
    private long numberOfItems;
    private String mobile;
    private String email;
    private String country;
    private Date timeCreated;
    private Date cartUpdated;
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

    public CheckoutCart(long id, long userID, long numberOfItems, String mobile, String email, String country, Date timeCreated, Date cartUpdated, byte[] isGift) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(long numberOfItems) {
        this.numberOfItems = numberOfItems;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getCartUpdated() {
        return cartUpdated;
    }

    public void setCartUpdated(Date cartUpdated) {
        this.cartUpdated = cartUpdated;
    }

    public byte[] getIsGift() {
        return isGift;
    }

    public void setIsGift(byte[] isGift) {
        this.isGift = isGift;
    }

    @Override
    public long id() {
        return 0;
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
