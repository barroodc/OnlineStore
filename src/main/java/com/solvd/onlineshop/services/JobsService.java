package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.ItemsInCartDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.JobsDao;
import com.solvd.onlineshop.model.checkout.ItemsInCart;
import com.solvd.onlineshop.model.labor.Jobs;
import com.solvd.onlineshop.services.interfaces.IJobsService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class JobsService implements IJobsService<Jobs> {

    private static final Logger LOGGER = LogManager.getLogger(JobsService.class);
    private static final JobsDao jobsDao;
    private static Jobs jobs;

    static {
        jobsDao = new JobsDao();
        jobs = null;
    }

    @Override
    public Jobs getJobsById(long id) {
        try {
            jobs = (Jobs) jobsDao.getJobsByID(id);
            LOGGER.info(jobs);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
