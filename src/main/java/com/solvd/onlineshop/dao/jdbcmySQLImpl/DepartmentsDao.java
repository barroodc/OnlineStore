package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IDepartmentsDao;
import com.solvd.onlineshop.model.labor.Departments;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartmentsDao extends BaseDao<Departments> implements IDepartmentsDao {

    private static final Logger logger = LogManager.getLogger(DepartmentsDao.class);
    protected final static String DEPARTMENTS_SEQUENCE = "onlinestore_departments_seq";


    public DepartmentsDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO departments (department_name) VALUES (?)";

    private static final String FINDBYID = "SELECT departments_id, department_name FROM departments WHERE departments_id = ?";

    private static final String UPDATE = "UPDATE departments SET department_name = ? FROM employees WHERE departments_id = ?";

    private static final String DELETE = "DELETE FROM departments WHERE departments_id = ?";

    @Override
    public Departments findById(long id) {
        Departments departments = new Departments();
        try(PreparedStatement statement = this.connection.prepareStatement(FINDBYID);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                departments.setId(rs.getLong("departments_id"));
                departments.setDepartmentName(rs.getString("department_name"));
            }
        }catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return departments;
    }

    @Override
    public List<Departments> findAll() {
        return null;
    }

    @Override
    public Departments update(Departments dto) {
        Departments departments = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setString(1, dto.getDepartmentName());
            statement.setLong(2, dto.getId());
            statement.execute();
            departments = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return departments;
    }

    @Override
    public Departments create(Departments dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setString(1, dto.getDepartmentName());
            statement.execute();
            int id = this.getLastVal(DEPARTMENTS_SEQUENCE);
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
    public List<Departments> getAllDepartments(long id) {
        return null;
    }
}
