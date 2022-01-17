package com.solvd.onlineshop.model.product;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ProductSupplier")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "productID", "supplierName", "categoryOfProducts"})

public class ProductSupplier {
    private Long id;
    private Long productID;
    private String supplierName;
    private String categoryOfProducts;

    public ProductSupplier() {

    }

    public ProductSupplier(String supplierName, String categoryOfProducts) {
        this.supplierName = supplierName;
        this.categoryOfProducts = categoryOfProducts;
    }

    public ProductSupplier(Long id, Long productID, String supplierName, String categoryOfProducts) {
        this.id = id;
        this.productID = productID;
        this.supplierName = supplierName;
        this.categoryOfProducts = categoryOfProducts;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
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
    public String toString() {
        return "ProductSupplier{" +
                "id=" + id +
                ", productID=" + productID +
                ", supplierName='" + supplierName + '\'' +
                ", categoryOfProducts='" + categoryOfProducts + '\'' +
                '}';
    }
}
