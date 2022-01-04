package com.solvd.onlineshop.model.purchase;

import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;
import java.util.Arrays;

@XmlRootElement(name = "Invoice")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "transactionID", "inventoryID", "isInStock", "price", "discount",
"preTax", "tax", "subtotal"})

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

    @XmlAttribute
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlAttribute
    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    @XmlElement(name = "inventoryID")
    public long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(long inventoryID) {
        this.inventoryID = inventoryID;
    }

    @XmlElement(name = "isInStock")
    public byte[] getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(byte[] isInStock) {
        this.isInStock = isInStock;
    }

    @XmlElement(name = "price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @XmlElement(name = "discount")
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @XmlElement(name = "preTax")
    public float getPreTax() {
        return preTax;
    }

    public void setPreTax(float preTax) {
        this.preTax = preTax;
    }

    @XmlElement(name = "tax")
    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    @XmlElement(name = "subtotal")
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
