package com.solvd.onlineshop.model.product;

public class Inventory {
    private Long id;
    private String productName;
    private String description;
    private float price;
    private Long amountInStock;

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

    public Inventory(Long id, String productName, String description, float price, Long amountInStock) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.amountInStock = amountInStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
