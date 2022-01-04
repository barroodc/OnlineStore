package com.solvd.onlineshop.model.purchase;
import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "OrderItem")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "orderID", "productID", "sku", "price", "discount", "quantity", "timeCreated"})


public class OrderItem implements DataTransferObject {
    private long id;
    private long orderID;
    private long productID;
    private String sku;
    private float price;
    private float discount;
    private Long quantity;
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

    public OrderItem(long id, long orderID, long productID, String sku, float price, float discount, Long quantity, Date timeCreated) {
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
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlAttribute
    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    @XmlAttribute
    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
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
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
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
    public long id() {
        return 0;
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
