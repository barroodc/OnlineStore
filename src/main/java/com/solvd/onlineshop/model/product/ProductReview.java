package com.solvd.onlineshop.model.product;
import java.sql.Date;

public class ProductReview {
    private Long id;
    private Long productID;
    private float overallRating;
    private String title;
    private Long parentID;
    private Date timeCreated;
    private String userReview;

    public ProductReview() {

    }

    public ProductReview(Long id, Long productID, float overallRating, String title, Long parentID, Date timeCreated, String userReview) {
        this.id = id;
        this.productID = productID;
        this.overallRating = overallRating;
        this.title = title;
        this.parentID = parentID;
        this.timeCreated = timeCreated;
        this.userReview = userReview;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
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

    public Long getParentID() {
        return parentID;
    }

    public void setParentID(Long parentID) {
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
}
