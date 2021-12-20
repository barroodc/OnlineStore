package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.ITransactionDao;
import com.solvd.onlineshop.purchase.Transaction;

import java.util.List;

public class TransactionDaoImpl implements ITransactionDao {

    private List<Transaction> transactions;

    public TransactionDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return null;
    }

    @Override
    public Transaction getTransactionByID(long id) {
        return null;
    }

    @Override
    public void updateTransaction(Transaction transaction) {

    }

    @Override
    public void deleteTransaction(Transaction transaction) {

    }
}
