package com.solvd.onlineshop.model.product;

import com.solvd.onlineshop.utils.DataTransferObject;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(long inventoryID) {
        this.inventoryID = inventoryID;
    }

    public long getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(long productTypeID) {
        this.productTypeID = productTypeID;
    }

    public long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    public long getMarketID() {
        return marketID;
    }

    public void setMarketID(long marketID) {
        this.marketID = marketID;
    }

    public long getShopID() {
        return shopID;
    }

    public void setShopID(long shopID) {
        this.shopID = shopID;
    }

    public long getCountryID() {
        return countryID;
    }

    public void setCountryID(long countryID) {
        this.countryID = countryID;
    }

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
