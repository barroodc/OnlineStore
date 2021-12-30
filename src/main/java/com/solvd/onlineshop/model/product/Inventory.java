package com.solvd.onlineshop.model.product;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.DepartmentsDao;
import com.solvd.onlineshop.utils.DataTransferObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class Inventory implements DataTransferObject, Serializable {

    @XmlAttribute(name = "id")
    private long id;

    @XmlElement(name = "productName")
    private String productName;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "price")
    private float price;

    @XmlElement(name = "amountInStock")
    private long amountInStock;

    private static final Logger logger = LogManager.getLogger(Inventory.class);

    private static final long serialVersionUID = 3L;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(Long amountInStock) {
        this.amountInStock = amountInStock;
    }

    void beforeUnmarshall(Unmarshaller unmarshaller, Object parent) {
        logger.info("Before unmarshaller callback");
    }

    void afterUnmarshall(Unmarshaller unmarshaller, Object parent) {
        logger.info("After unmarhshaller callback");
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
