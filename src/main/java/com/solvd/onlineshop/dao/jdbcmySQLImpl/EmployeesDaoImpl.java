package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IEmployeesDao;
import com.solvd.onlineshop.model.labor.Employees;
import com.solvd.onlineshop.model.product.Inventory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class EmployeesDaoImpl extends BaseDaoImpl<Employees> implements IEmployeesDao {

    private static final Logger logger = LogManager.getLogger(EmployeesDaoImpl.class);
    protected final static String EMPLOYEES_SEQUENCE = "onlinestore_employees_seq";


    public EmployeesDaoImpl(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO employees (jobs_id, departments_id, mobile, email," +
            "hire_date, job_id, salary, manager_id, department_id VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

    private static final String FINDBYID = "SELECT employees_id, jobs_id, departments_id, mobile, email," +
            "hire_date, job_id, salary, manager_id, department_id FROM employees WHERE employee_id = ?";

    private static final String UPDATE = "UPDATE employees SET jobs_id = ?, departments_id = ?, mobile = ?, " +
            "email = ?, hire_date = ?, job_id = ?, salary = ?, manager_id = ?, department_id = ? FROM employees WHERE employee_id = ?";

    private static final String DELETE = "DELETE FROM employees WHERE employee_id = ?";

    @Override
    public Employees findById(long id) {
        Employees employees = new Employees();
        try(PreparedStatement statement = this.connection.prepareStatement(FINDBYID);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                employees.setId(rs.getLong("employees_id"));
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
            logger.error(e);
            throw new RuntimeException(e);
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
            logger.error(e);
            throw new RuntimeException(e);
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
            int id = this.getLastVal(EMPLOYEES_SEQUENCE);
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
    public List<Employees> getAllEmployees(long id) {
        return null;
    }

    @Override
    public Employees getContactInformation(String firstName, String lastName, String mobile, String email) {
        return null;
    }

    @Override
    public Map<String, Date> nameAndHireDate() {
        return null;
    }

    @Override
    public Map<String, Float> nameAndSalary() {
        return null;
    }
}
