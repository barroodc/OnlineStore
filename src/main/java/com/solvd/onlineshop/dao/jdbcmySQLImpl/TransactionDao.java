package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.ITransactionDao;
import com.solvd.onlineshop.model.purchase.Transaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;

public class TransactionDao extends BaseDao<Transaction> implements ITransactionDao {

    private static final Logger logger = LogManager.getLogger(TransactionDao.class);
    protected final static String TRANSACTION_SEQUENCE = "onlinestore_transaction_seq";


    public TransactionDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO transaction (status, time_created," +
            "approval status) VALUES (?, ?, ?)";

    private static final String FINDBYID = "SELECT transaction_id, status, time_created, " +
            "approval status FROM transaction WHERE transaction_id = ?";

    private static final String UPDATE = "UPDATE transaction SET status = ?, time_created = ?, " +
            "approval_status = ? WHERE transaction_id = ?";

    private static final String DELETE = "DELETE FROM transaction WHERE transaction_id = ?";

    @Override
    public Transaction findById(long id) {
        Transaction transaction = new Transaction();
        try(PreparedStatement statement = this.connection.prepareStatement(FINDBYID);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                transaction.setId(rs.getLong("transaction_id"));
                transaction.setStatus(rs.getString("status"));
                transaction.setTimeCreated(rs.getDate("time_created"));
                transaction.setApprovalStatus(rs.getString("approval_status"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return transaction;
    }

    @Override
    public List<Transaction> findAll() {
        return null;
    }

    @Override
    public Transaction update(Transaction dto) {
        Transaction transaction = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setString(1, dto.getStatus());
            statement.setDate(2,dto.getTimeCreated());
            statement.setString(3,dto.getApprovalStatus());
            statement.setLong(4, dto.getId());
            statement.execute();
            transaction = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return transaction;
    }

    @Override
    public Transaction create(Transaction dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setString(1, dto.getStatus());
            statement.execute();
            int id = this.getLastVal(TRANSACTION_SEQUENCE);
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
    public Transaction getTransactionCycle(Date timeCreated, String status, String approvalStatus) {
        return null;
    }
}
