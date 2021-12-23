package com.solvd.onlineshop.model.purchase;

public class Invoice {
    private Long id;
    private Long transactionID;
    private Long inventoryID;
    private byte[] isInStock;
    private float price;
    private float discount;
    private float preTax;
    private float tax;
    private float subtotal;

    public Invoice() {

    }

    public Invoice(byte[] inStock) {
        this.isInStock = inStock;
    }

    public Invoice(float price, float discount, float preTax, float tax, float subtotal) {
        this.price = price;
        this.preTax = preTax;
        this.tax = tax;
        this.subtotal = subtotal;
    }

    public Invoice(Long id, Long transactionID, Long inventoryID, byte[] isInStock, float price, float discount, float preTax, float tax, float subtotal) {
        this.id = id;
        this.transactionID = transactionID;
        this.inventoryID = inventoryID;
        this.isInStock = isInStock;
        this.price = price;
        this.discount = discount;
        this.preTax = preTax;
        this.tax = tax;
        this.subtotal = subtotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(Long inventoryID) {
        this.inventoryID = inventoryID;
    }

    public byte[] getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(byte[] isInStock) {
        this.isInStock = isInStock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getPreTax() {
        return preTax;
    }

    public void setPreTax(float preTax) {
        this.preTax = preTax;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
