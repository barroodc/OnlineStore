package com.solvd.onlineshop.model.purchase;
import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "Transaction")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "userID", "status", "timeCreated", "approvalStatus"})

public class Transaction implements DataTransferObject {
    private Long id;
    private Long userID;
    private String status;
    private Date timeCreated;
    private String approvalStatus;

    public Transaction() {

    }

    public Transaction(long id, Long userID, String status, Date timeCreated, String approvalStatus) {
        this.id = id;
        this.userID = userID;
        this.status = status;
        this.timeCreated = timeCreated;
        this.approvalStatus = approvalStatus;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    @XmlElement(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(name = "timeCreated")
    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    @XmlElement(name = "approvalStatus")
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
