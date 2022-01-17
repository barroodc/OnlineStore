package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IEmployeesDao;
import com.solvd.onlineshop.model.labor.Employees;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;

public class EmployeesDao extends AbstractMySQLDao<Employees> implements IEmployeesDao{

    private static final Logger LOGGER = LogManager.getLogger(EmployeesDao.class);


    public EmployeesDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO employees (departments_id, mobile, email," +
            "hire_date, job_id, salary, manager_id, department_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

    private static final String GET_ONE = "SELECT id, jobs_id, departments_id, mobile, email," +
            "hire_date, job_id, salary, manager_id, department_id FROM employees WHERE id = ?";

    private static final String UPDATE = "UPDATE employees SET jobs_id = ?, departments_id = ?, mobile = ?, " +
            "email = ?, hire_date = ?, job_id = ?, salary = ?, manager_id = ?, department_id = ? FROM employees WHERE id = ?";

    private static final String DELETE = "DELETE FROM employees WHERE id = ?";

    @Override
    public Employees findById(long id) {
        Employees employees = new Employees();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                employees.setId(rs.getLong("id"));
                employees.setJobsID(rs.getLong("jobs_id"));
                employees.setDepartmentID(rs.getLong("departments_id"));
                employees.setMobile(rs.getString("mobile"));
                employees.setEmail(rs.getString("email"));
                employees.setHireDate(rs.getDate("hire_date"));
                employees.setJobID(rs.getString("job_id"));
                employees.setSalary(rs.getFloat("salary"));
                employees.setManagerID(rs.getLong("manager_id"));
                employees.setDepartmentID(rs.getLong("department_id"));
            }
        }catch (SQLException e){
            LOGGER.error(e);
        }
        return employees;
    }

    @Override
    public List<Employees> findAll() {
        return null;
    }

    @Override
    public Employees update(Employees dto) {
        Employees employees = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setLong(1, dto.getJobsID());
            statement.setLong(2, dto.getDepartmentsID());
            statement.setString(3, dto.getMobile());
            statement.setString(4, dto.getEmail());
            statement.setDate(5, dto.getHireDate());
            statement.setString(6, dto.getJobID());
            statement.setFloat(7, dto.getSalary());
            statement.setLong(8, dto.getManagerID());
            statement.setLong(9, dto.getDepartmentID());
            statement.setLong(10, dto.getId());
            statement.execute();
            employees = this.findById(dto.getId());
        }catch(SQLException e){
            LOGGER.error(e);
        }
        return employees;
    }

    @Override
    public Employees create(Employees dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setLong(1, dto.getJobsID());
            statement.setLong(2, dto.getDepartmentsID());
            statement.setString(3, dto.getMobile());
            statement.setString(4, dto.getEmail());
            statement.setDate(5, dto.getHireDate());
            statement.setString(6, dto.getJobID());
            statement.setFloat(7, dto.getSalary());
            statement.setLong(8, dto.getManagerID());
            statement.setLong(9, dto.getDepartmentID());
            statement.execute();
        }catch(SQLException e){
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        try(PreparedStatement statement = this.connection.prepareStatement(DELETE);) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e){
            LOGGER.error(e);
        }
    }

    @Override
    public List<Employees> getAllEmployees(long id) {
        return null;
    }

}
