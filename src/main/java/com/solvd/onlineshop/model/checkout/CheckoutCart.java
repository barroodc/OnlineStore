package com.solvd.onlineshop.model.checkout;
import java.sql.Date;

public class CheckoutCart {
    private Long id;
    private Long userID;
    private Long numberOfItems;
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

    public CheckoutCart(Long numberOfItems) {
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

    public CheckoutCart(Long id, Long userID, Long numberOfItems, String mobile, String email, String country, Date timeCreated, Date cartUpdated, byte[] isGift) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Long numberOfItems) {
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
}
