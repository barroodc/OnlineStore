package com.solvd.onlineshop.model.labor;

public class Jobs {
    private Long id;
    private String jobTitle;
    private float minSalary;
    private float maxSalary;

    public Jobs() {

    }

    public Jobs(Long id, String jobTitle, float minSalary, float maxSalary) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(float minSalary) {
        this.minSalary = minSalary;
    }

    public float getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(float maxSalary) {
        this.maxSalary = maxSalary;
    }
}
