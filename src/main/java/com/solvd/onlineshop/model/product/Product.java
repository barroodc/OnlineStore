package com.solvd.onlineshop.model.product;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "inventoryID", "productTypeID", "categoryID",
"shopID", "countryID", "productName"})

public class Product {
    private Long id;
    private Long inventoryID;
    private long productTypeID;
    private long categoryID;
    private long shopID;
    private long countryID;
    private String productName;

    public Product() {

    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(Long id, Long inventoryID, long productTypeID, long categoryID, long shopID, long countryID, String productName) {
        this.id = id;
        this.inventoryID = inventoryID;
        this.productTypeID = productTypeID;
        this.categoryID = categoryID;
        this.shopID = shopID;
        this.countryID = countryID;
        this.productName = productName;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public Long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(Long inventoryID) {
        this.inventoryID = inventoryID;
    }

    @XmlElement(name = "productTypeID")
    public long getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(long productTypeID) {
        this.productTypeID = productTypeID;
    }

    @XmlElement(name = "categoryID")
    public long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    @XmlElement(name = "shopID")
    public long getShopID() {
        return shopID;
    }

    public void setShopID(long shopID) {
        this.shopID = shopID;
    }

    @XmlElement(name = "countryID")
    public long getCountryID() {
        return countryID;
    }

    public void setCountryID(long countryID) {
        this.countryID = countryID;
    }

    @XmlElement(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", inventoryID=" + inventoryID +
                ", productTypeID=" + productTypeID +
                ", categoryID=" + categoryID +
                ", shopID=" + shopID +
                ", countryID=" + countryID +
                ", productName='" + productName + '\'' +
                '}';
    }
}
