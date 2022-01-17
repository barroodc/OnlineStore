package com.solvd.onlineshop.model.labor;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Jobs")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "jobTitle", "minSalary", "maxSalary"})

public class Jobs  {
    private Long id;
    private String jobTitle;
    private float minSalary;
    private float maxSalary;

    public Jobs() {

    }

    public Jobs(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Jobs(float minSalary, float maxSalary) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Jobs(Long id, String jobTitle, float positionSalary, float minSalary, float maxSalary) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
    public String toString() {
        return "Jobs{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}
