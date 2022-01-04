package com.solvd.onlineshop.model.product;

import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ProductSupplier")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "productID", "supplierName", "categoryOfProducts"})

public class ProductSupplier implements DataTransferObject {
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

    @XmlAttribute
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlAttribute
    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    @XmlElement(name = "supplierName")
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @XmlElement(name = "categoryOfProducts")
    public String getCategoryOfProducts() {
        return categoryOfProducts;
    }

    public void setCategoryOfProducts(String categoryOfProducts) {
        this.categoryOfProducts = categoryOfProducts;
    }

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "ProductSupplier{" +
                "id=" + id +
                ", productID=" + productID +
                ", supplierName='" + supplierName + '\'' +
                ", categoryOfProducts='" + categoryOfProducts + '\'' +
                '}';
    }
}
