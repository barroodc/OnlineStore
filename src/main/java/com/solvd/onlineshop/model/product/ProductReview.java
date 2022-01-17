package com.solvd.onlineshop.model.product;
import jakarta.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "ProductReview")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "productID", "overallRating", "title", "parentID", "timeCreated", "userReview"})

public class ProductReview {
    private Long id;
    private Long productID;
    private float overallRating;
    private String title;
    private long parentID;
    private Date timeCreated;
    private String userReview;

    public ProductReview() {

    }

    public ProductReview(String title, float overallRating) {
        this.title = title;
        this.overallRating = overallRating;
    }

    public ProductReview(float overallRating, String userReview) {
        this.overallRating = overallRating;
        this.userReview = userReview;
    }

    public ProductReview(String title, Date timeCreated) {
        this.title = title;
        this.timeCreated = timeCreated;
    }

    public ProductReview(Long id, Long productID, float overallRating, String title, long parentID, Date timeCreated, String userReview) {
        this.id = id;
        this.productID = productID;
        this.overallRating = overallRating;
        this.title = title;
        this.parentID = parentID;
        this.timeCreated = timeCreated;
        this.userReview = userReview;
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

    @XmlElement(name = "overallRating")
    public float getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(float overallRating) {
        this.overallRating = overallRating;
    }

    @XmlElement(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name = "parentID")
    public long getParentID() {
        return parentID;
    }

    public void setParentID(long parentID) {
        this.parentID = parentID;
    }

    @XmlElement(name = "timeCreated")
    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    @XmlElement(name = "userReview")
    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }

    @Override
    public String toString() {
        return "ProductReview{" +
                "id=" + id +
                ", productID=" + productID +
                ", overallRating=" + overallRating +
                ", title='" + title + '\'' +
                ", parentID=" + parentID +
                ", timeCreated=" + timeCreated +
                ", userReview='" + userReview + '\'' +
                '}';
    }
}
