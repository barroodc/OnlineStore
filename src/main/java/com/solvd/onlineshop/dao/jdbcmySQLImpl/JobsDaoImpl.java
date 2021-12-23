package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IJobsDao;
import com.solvd.onlineshop.model.labor.Jobs;

import java.util.List;
import java.util.Map;

public class JobsDaoImpl extends BaseDaoImpl<Jobs> implements IJobsDao {

    private List<Jobs> jobs;

    public JobsDaoImpl() {

    }

    @Override
    public void createEntity(Jobs entity) {

    }

    @Override
    public void updateEntity(Jobs entity) {

    }

    @Override
    public Jobs getEntityById(long id) {
        return null;
    }

    @Override
    public void deleteEntity(long id) {

    }

    @Override
    public Map<String, Float> jobsAndSalary() {
        return null;
    }

    @Override
    public List<Jobs> getMinAndMaxSalaries() {
        return null;
    }


}
