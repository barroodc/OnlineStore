package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.labor.Jobs;

import java.util.List;

public interface IJobsDao {

    List<Jobs> getAllJobs();
    Jobs getJobsByID(long id);
    void addJobs(Jobs jobs);
    void deleteJobs(Jobs jobs);
}
