package com.solvd.onlineshop.model.product;

public class ProductCategory {
    private Long id;
    private Long productID;
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

    public ProductCategory(Long id, Long productID, String title, String metaTitle, String productName) {
        this.id = id;
        this.productID = productID;
        this.title = title;
        this.metaTitle = metaTitle;
        this.productName = productName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductID() {
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
