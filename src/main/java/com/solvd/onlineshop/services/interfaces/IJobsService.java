package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.labor.Jobs;

public interface IJobsService {

    Jobs getJobsById(long id);
}
