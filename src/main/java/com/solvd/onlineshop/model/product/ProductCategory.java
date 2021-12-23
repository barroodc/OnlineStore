package com.solvd.onlineshop.model.product;

public class ProductCategory {
    private long id;
    private long productID;
    private String title;
    private String metaTitle;
    private String productName;

    public ProductCategory() {

    }

    public ProductCategory(String productName) {
        this.productName = productName;
    }

    public ProductCategory(String title, String metaTitle) {
        this.title = title;
        this.metaTitle = metaTitle;
    }

    public ProductCategory(long id, long productID, String title, String metaTitle, String productName) {
        this.id = id;
        this.productID = productID;
        this.title = title;
        this.metaTitle = metaTitle;
        this.productName = productName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
