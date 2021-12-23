package com.solvd.onlineshop.model.checkout;
import java.sql.Date;

public class ItemsInCart {
    private long id;
    private long productID;
    private String productName;
    private String sku;
    private float price;
    private float subtotalOfItems;
    private float discount;
    private float quantity;
    private Date timeCreated;
    private Date cartUpdated;

    public ItemsInCart() {

    }

    public ItemsInCart(float subtotalOfItems, float quantity) {
        this.subtotalOfItems = subtotalOfItems;
        this.quantity = quantity;
    }

    public ItemsInCart(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    public ItemsInCart(Date timeCreated, Date cartUpdated) {
        this.timeCreated = timeCreated;
        this.cartUpdated = cartUpdated;
    }

    public ItemsInCart(float subtotalOfItems, float quantity, float discount) {
        this.subtotalOfItems = subtotalOfItems;
        this.quantity = quantity;
        this.discount = discount;
    }

    public ItemsInCart(long id, long productID, String productName, String sku, float price, float subtotalOfItems, float discount, float quantity, Date timeCreated, Date cartUpdated) {
        this.id = id;
        this.productID = productID;
        this.productName = productName;
        this.sku = sku;
        this.price = price;
        this.subtotalOfItems = subtotalOfItems;
        this.discount = discount;
        this.quantity = quantity;
        this.timeCreated = timeCreated;
        this.cartUpdated = cartUpdated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSubtotalOfItems() {
        return subtotalOfItems;
    }

    public void setSubtotalOfItems(float subtotalOfItems) {
        this.subtotalOfItems = subtotalOfItems;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
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
}
