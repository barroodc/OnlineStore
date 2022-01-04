package com.solvd.onlineshop.model.product;

import com.solvd.onlineshop.utils.DataTransferObject;
import jakarta.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ProductCategory")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "productID", "title", "metaTitle", "productName"})

public class ProductCategory implements DataTransferObject {
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

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    @XmlElement(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name = "metaTitle")
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    @XmlElement(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", productID=" + productID +
                ", title='" + title + '\'' +
                ", metaTitle='" + metaTitle + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
