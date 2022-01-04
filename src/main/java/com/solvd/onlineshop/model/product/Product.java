package com.solvd.onlineshop.model.product;

import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "inventoryID", "productTypeID", "categoryID", "marketID",
"shopID", "countryID", "productName"})

public class Product implements DataTransferObject {
    private long id;
    private long inventoryID;
    private long productTypeID;
    private long categoryID;
    private long marketID;
    private long shopID;
    private long countryID;
    private String productName;

    public Product() {

    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(Long id, Long inventoryID, Long productTypeID, Long categoryID, Long marketID, Long shopID, Long countryID, String productName) {
        this.id = id;
        this.inventoryID = inventoryID;
        this.productTypeID = productTypeID;
        this.categoryID = categoryID;
        this.marketID = marketID;
        this.shopID = shopID;
        this.countryID = countryID;
        this.productName = productName;
    }

    @XmlAttribute
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlAttribute
    public long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(long inventoryID) {
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

    @XmlElement(name = "marketID")
    public long getMarketID() {
        return marketID;
    }

    public void setMarketID(long marketID) {
        this.marketID = marketID;
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
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", inventoryID=" + inventoryID +
                ", productTypeID=" + productTypeID +
                ", categoryID=" + categoryID +
                ", marketID=" + marketID +
                ", shopID=" + shopID +
                ", countryID=" + countryID +
                ", productName='" + productName + '\'' +
                '}';
    }
}
