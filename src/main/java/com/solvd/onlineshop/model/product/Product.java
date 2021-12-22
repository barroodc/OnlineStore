package com.solvd.onlineshop.model.product;

public class Product {
    private Long id;
    private Long inventoryID;
    private Long productTypeID;
    private Long categoryID;
    private Long marketID;
    private Long shopID;
    private Long countryID;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(Long inventoryID) {
        this.inventoryID = inventoryID;
    }

    public Long getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(Long productTypeID) {
        this.productTypeID = productTypeID;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public Long getMarketID() {
        return marketID;
    }

    public void setMarketID(Long marketID) {
        this.marketID = marketID;
    }

    public Long getShopID() {
        return shopID;
    }

    public void setShopID(Long shopID) {
        this.shopID = shopID;
    }

    public Long getCountryID() {
        return countryID;
    }

    public void setCountryID(Long countryID) {
        this.countryID = countryID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
