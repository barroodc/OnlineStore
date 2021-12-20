package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IJobsDao;
import com.solvd.onlineshop.labor.Jobs;

import java.util.List;

public class JobsDaoImpl implements IJobsDao {

    private List<Jobs> jobs;

    public JobsDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<Jobs> getAllJobs() {
        return null;
    }

    @Override
    public Jobs getJobsByID(Long id) {
        return null;
    }

    @Override
    public void addJobs(Jobs jobs) {

    }

    @Override
    public void deleteJobs(Jobs jobs) {

    }
}
