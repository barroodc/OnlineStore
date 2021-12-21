package com.solvd.onlineshop.model.purchase;
import java.sql.Date;

public class OrderItem {
    private Long id;
    private Long orderID;
    private Long productID;
    private String sku;
    private float price;
    private float discount;
    private Long quantity;
    private Date timeCreated;

    public OrderItem() {

    }

    public OrderItem(Long id, Long orderID, Long productID, String sku, float price, float discount, Long quantity, Date timeCreated) {
        this.id = id;
        this.orderID = orderID;
        this.productID = productID;
        this.sku = sku;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.timeCreated = timeCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
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

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}
