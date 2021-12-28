package com.solvd.onlineshop.model.purchase;

import com.solvd.onlineshop.utils.DataTransferObject;

import java.util.Arrays;

public class Invoice implements DataTransferObject {
    private long id;
    private long transactionID;
    private long inventoryID;
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

    public Invoice(long id, long transactionID, long inventoryID, byte[] isInStock, float price, float discount, float preTax, float tax, float subtotal) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    public long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(long inventoryID) {
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

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", transactionID=" + transactionID +
                ", inventoryID=" + inventoryID +
                ", isInStock=" + Arrays.toString(isInStock) +
                ", price=" + price +
                ", discount=" + discount +
                ", preTax=" + preTax +
                ", tax=" + tax +
                ", subtotal=" + subtotal +
                '}';
    }
}
