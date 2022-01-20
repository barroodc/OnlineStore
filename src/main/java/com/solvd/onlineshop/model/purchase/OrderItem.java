package com.solvd.onlineshop.model.purchase;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "OrderItem")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "orderID", "productID", "sku", "price", "discount", "quantity", "timeCreated"})


public class OrderItem {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("orderID")
    private Long orderID;
    @JsonProperty("productID")
    private Long productID;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("price")
    private float price;
    @JsonProperty("discount")
    private float discount;
    @JsonProperty("quantity")
    private long quantity;
    @JsonProperty("timeCreated")
    private Date timeCreated;

    public OrderItem() {

    }

    public OrderItem(float discount) {
        this.discount = discount;
    }

    public OrderItem(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public OrderItem(String sku, float price) {
        this.sku = sku;
        this.price = price;
    }

    public OrderItem(Long id, Long orderID, Long productID, String sku, float price, float discount, long quantity, Date timeCreated) {
        this.id = id;
        this.orderID = orderID;
        this.productID = productID;
        this.sku = sku;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.timeCreated = timeCreated;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    @XmlAttribute
    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    @XmlElement(name = "sku")
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @XmlElement(name = "price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @XmlElement(name = "discount")
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @XmlElement(name = "quantity")
    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @XmlElement(name = "timeCreated")
    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }


    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderID=" + orderID +
                ", productID=" + productID +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", timeCreated=" + timeCreated +
                '}';
    }
}
