package com.solvd.onlineshop.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "Inventory")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "productName", "description", "price", "amountInStock"})

public class Inventory implements Serializable {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("price")
    private float price;
    @JsonProperty("amountInStock")
    private long amountInStock;


    public Inventory() {

    }

    public Inventory(String productName, String description) {
        this.productName = productName;
        this.description = description;
    }

    public Inventory(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    public Inventory(String productName, long amountInStock) {
       this.productName = productName;
       this.amountInStock = amountInStock;
    }

    public Inventory(Long id, String productName, String description, float price, long amountInStock) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.amountInStock = amountInStock;
    }

    @XmlAttribute(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = "price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @XmlElement(name = "amountInStock")
    public long getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(long amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", amountInStock=" + amountInStock +
                '}';
    }


}
