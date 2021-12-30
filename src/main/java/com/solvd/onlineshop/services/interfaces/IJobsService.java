package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.labor.Jobs;

public interface IJobsService<T> {

    Jobs getJobsById(long id);
}
