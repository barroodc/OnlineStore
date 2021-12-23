package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.ITransactionDao;
import com.solvd.onlineshop.model.purchase.Transaction;

import java.sql.Date;
import java.util.List;

public class TransactionDaoImpl extends BaseDaoImpl<Transaction> implements ITransactionDao {

    private List<Transaction> transactions;

    public TransactionDaoImpl() {

    }

    @Override
    public void createEntity(Transaction entity) {

    }

    @Override
    public void updateEntity(Transaction entity) {

    }

    @Override
    public Transaction getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

    @Override
    public Transaction getTransactionCycle(Date timeCreated, String status, String approvalStatus) {
        return null;
    }
}
