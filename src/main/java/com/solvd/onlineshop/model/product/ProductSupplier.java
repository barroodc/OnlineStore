package com.solvd.onlineshop.model.product;

public class ProductSupplier {
    private long id;
    private long productID;
    private String supplierName;
    private String categoryOfProducts;

    public ProductSupplier() {

    }

    public ProductSupplier(String supplierName, String categoryOfProducts) {
        this.supplierName = supplierName;
        this.categoryOfProducts = categoryOfProducts;
    }

    public ProductSupplier(long id, long productID, String supplierName, String categoryOfProducts) {
        this.id = id;
        this.productID = productID;
        this.supplierName = supplierName;
        this.categoryOfProducts = categoryOfProducts;
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

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCategoryOfProducts() {
        return categoryOfProducts;
    }

    public void setCategoryOfProducts(String categoryOfProducts) {
        this.categoryOfProducts = categoryOfProducts;
    }
}
