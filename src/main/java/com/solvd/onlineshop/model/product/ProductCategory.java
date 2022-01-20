package com.solvd.onlineshop.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ProductCategory")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "productID", "title", "metaTitle", "productName"})

public class ProductCategory {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("productID")
    private Long productID;
    @JsonProperty("title")
    private String title;
    @JsonProperty("metaTitle")
    private String metaTitle;
    @JsonProperty("productName")
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
