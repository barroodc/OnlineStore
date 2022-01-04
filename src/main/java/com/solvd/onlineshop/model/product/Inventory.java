package com.solvd.onlineshop.model.product;

import com.solvd.onlineshop.utils.DataTransferObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "Inventory")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id","productName","description","price","amountInStock"})

public class Inventory implements DataTransferObject, Serializable {


    private long id;
    private String productName;
    private String description;
    private float price;
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

    public Inventory(String productName, Long amountInStock) {
       this.productName = productName;
       this.amountInStock = amountInStock;
    }

    public Inventory(long id, String productName, String description, float price, Long amountInStock) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.amountInStock = amountInStock;
    }

    @XmlAttribute(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    public Long getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(Long amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public long id() {
        return 0;
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
