package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.labor.Jobs;

import java.util.List;
import java.util.Map;


public interface IJobsDao extends IBaseDao<Jobs>{
    Map<String, Float> jobsAndSalary();
    List<Jobs> getMinAndMaxSalaries();
}
