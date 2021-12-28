package com.solvd.onlineshop.model.purchase;
import com.solvd.onlineshop.utils.DataTransferObject;

import java.sql.Date;

public class Transaction implements DataTransferObject {
    private long id;
    private long userID;
    private String status;
    private Date timeCreated;
    private String approvalStatus;

    public Transaction() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", userID=" + userID +
                ", status='" + status + '\'' +
                ", timeCreated=" + timeCreated +
                ", approvalStatus='" + approvalStatus + '\'' +
                '}';
    }
}
