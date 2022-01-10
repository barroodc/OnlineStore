package com.solvd.onlineshop.services;

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

    private static final Logger logger = LogManager.getLogger(JobsService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Jobs> jobsList;

    @Override
    public Jobs getJobsById(long id) {
        Jobs jobs = null;
        AtomicReference<String> select = new AtomicReference<>("select * from jobs where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    String jobTitle = resultSet.getString("job_title");
                    float positionSalary = resultSet.getFloat("position_salary");
                    float minSalary = resultSet.getFloat("min_salary");
                    float maxSalary = resultSet.getFloat("max_salary");
                    jobs = new Jobs(id, jobTitle, positionSalary, minSalary, maxSalary);
                    jobsList.add(jobs);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return jobs;
    }
}
