package com.solvd.onlineshop.model.product;

public class Inventory {
    private Long id;
    private String description;
    private float price;
    private Long amountInStock;

    public Inventory() {

    }

    public Inventory(Long id, String description, float price, Long amountInStock) {
        this.id = id;
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
