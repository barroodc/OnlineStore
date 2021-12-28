package com.solvd.onlineshop.model.product;
import com.solvd.onlineshop.utils.DataTransferObject;

import java.sql.Date;

public class ProductReview implements DataTransferObject {
    private long id;
    private long productID;
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

    public ProductReview(long id, long productID, float overallRating, String title, long parentID, Date timeCreated, String userReview) {
        this.id = id;
        this.productID = productID;
        this.overallRating = overallRating;
        this.title = title;
        this.parentID = parentID;
        this.timeCreated = timeCreated;
        this.userReview = userReview;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public float getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(float overallRating) {
        this.overallRating = overallRating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getParentID() {
        return parentID;
    }

    public void setParentID(long parentID) {
        this.parentID = parentID;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }

    @Override
    public long id() {
        return 0;
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
