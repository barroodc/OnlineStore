package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IJobsDao;
import com.solvd.onlineshop.model.labor.Jobs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JobsDao extends BaseDao<Jobs> implements IJobsDao {

    private static final Logger logger = LogManager.getLogger(JobsDao.class);
    protected final static String JOBS_SEQUENCE = "onlinestore_jobs_seq";


    public JobsDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO jobs (job_title, position_salary, min_salary, max_salary) VALUES (?, ?, ?, ?);";

    private static final String FINDBYID = "SELECT jobs_id, job_title, position_salary, min_salary, max_salary FROM jobs WHERE jobs_id = ?";

    private static final String UPDATE = "UPDATE jobs SET position_salary = ?, min_salary = ?, max_salary = ? WHERE jobs_id = ?";

    private static final String DELETE = "DELETE FROM jobs WHERE jobs_id = ?";

    @Override
    public Jobs findById(long id) {
        Jobs jobs = new Jobs();
        try(PreparedStatement statement = this.connection.prepareStatement(FINDBYID);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                jobs.setId(rs.getLong("jobs_id"));
                jobs.setJobTitle(rs.getString("job_title"));
                jobs.setPositionSalary(rs.getFloat("position_salary"));
                jobs.setMinSalary(rs.getFloat("min_salary"));
                jobs.setMaxSalary(rs.getFloat("max_salary"));

            }
        }catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return jobs;
    }

    @Override
    public List<Jobs> findAll() {
        return null;
    }

    @Override
    public Jobs update(Jobs dto) {
        Jobs jobs = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setString(1, dto.getJobTitle());
            statement.setFloat(2, dto.getPositionSalary());
            statement.setFloat(3, dto.getMinSalary());
            statement.setFloat(4, dto.getMaxSalary());
            statement.setLong(5, dto.getId());
            statement.execute();
            jobs = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return jobs;
    }

    @Override
    public Jobs create(Jobs dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setString(1, dto.getJobTitle());
            statement.setFloat(2, dto.getPositionSalary());
            statement.setFloat(3, dto.getMinSalary());
            statement.setFloat(4, dto.getMaxSalary());
            statement.execute();
            int id = this.getLastVal(JOBS_SEQUENCE);
            return this.findById(id);
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(long id) {
        try(PreparedStatement statement = this.connection.prepareStatement(DELETE);) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<String, Float> jobsAndSalary() {
        return null;
    }

    @Override
    public List<Jobs> getMinAndMaxSalaries(long id) {
        return null;
    }
}
