package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.labor.Jobs;

import java.util.List;
import java.util.Map;


public interface IJobsDao extends IBaseDao<Jobs>{ ;
    List<Jobs> getJobsByID(long id);
}
