package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IJobsDao;
import com.solvd.onlineshop.model.labor.Jobs;

import java.util.List;

public class JobsDaoImpl extends BaseDaoImpl<Jobs> implements IJobsDao {

    private List<Jobs> jobs;

    public JobsDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(Jobs entity) {

    }

    @Override
    public void updateEntity(Jobs entity) {

    }

    @Override
    public Jobs getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
