package com.solvd.onlineshop.model.labor;

import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Jobs")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "jobTitle", "positionSalary", "minSalary", "maxSalary"})

public class Jobs implements DataTransferObject {
    private long id;
    private String jobTitle;
    private float positionSalary;
    private float minSalary;
    private float maxSalary;

    public Jobs() {

    }

    public Jobs(String jobTitle, float positionSalary) {
        this.jobTitle = jobTitle;
        this.positionSalary = positionSalary;
    }

    public Jobs(float minSalary, float maxSalary) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Jobs(long id, String jobTitle, float positionSalary, float minSalary, float maxSalary) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @XmlAttribute
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlAttribute
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @XmlElement(name = "positionSalary")
    public float getPositionSalary() {
        return positionSalary;
    }

    public void setPositionSalary(float positionSalary) {
        this.positionSalary = positionSalary;
    }

    @XmlElement(name = "minSalary")
    public float getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(float minSalary) {
        this.minSalary = minSalary;
    }

    @XmlElement(name = "maxSalary")
    public float getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(float maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", positionSalary=" + positionSalary +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}
