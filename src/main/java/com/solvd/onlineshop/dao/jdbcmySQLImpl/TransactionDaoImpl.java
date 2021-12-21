package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.ITransactionDao;
import com.solvd.onlineshop.model.purchase.Transaction;

import java.util.List;

public class TransactionDaoImpl extends BaseDaoImpl<Transaction> implements ITransactionDao {

    private List<Transaction> transactions;

    public TransactionDaoImpl() {
        //arraylist will be initialized here.
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

}
