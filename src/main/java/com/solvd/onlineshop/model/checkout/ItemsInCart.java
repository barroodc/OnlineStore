package com.solvd.onlineshop.model.checkout;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "ItemsInCart")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "productID", "sku", "price",
"subtotalOfItems", "discount", "quantity", "timeCreated", "cartUpdated"})

public class ItemsInCart {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("productID")
    private Long productID;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("price")
    private float price;
    @JsonProperty("subtotalOfItems")
    private float subtotalOfItems;
    @JsonProperty("discount")
    private float discount;
    @JsonProperty("quantity")
    private float quantity;
    @JsonProperty("timeCreated")
    private Date timeCreated;
    @JsonProperty("cartUpdated")
    private Date cartUpdated;

    public ItemsInCart() {

    }

    public ItemsInCart(float subtotalOfItems, float quantity) {
        this.subtotalOfItems = subtotalOfItems;
        this.quantity = quantity;
    }

    public ItemsInCart(float price) {
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

    public ItemsInCart(Long id, Long productID, String sku, float price, float subtotalOfItems, float discount, float quantity, Date timeCreated, Date cartUpdated) {
        this.id = id;
        this.productID = productID;
        this.sku = sku;
        this.price = price;
        this.subtotalOfItems = subtotalOfItems;
        this.discount = discount;
        this.quantity = quantity;
        this.timeCreated = timeCreated;
        this.cartUpdated = cartUpdated;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @XmlElement(name = "float")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @XmlElement(name = "subtotalOfItems")
    public float getSubtotalOfItems() {
        return subtotalOfItems;
    }

    public void setSubtotalOfItems(float subtotalOfItems) {
        this.subtotalOfItems = subtotalOfItems;
    }

    @XmlElement(name = "discount")
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @XmlElement(name = "quantity")
    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "ItemsInCart{" +
                "id=" + id +
                ", productID=" + productID +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", subtotalOfItems=" + subtotalOfItems +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", timeCreated=" + timeCreated +
                ", cartUpdated=" + cartUpdated +
                '}';
    }
}
