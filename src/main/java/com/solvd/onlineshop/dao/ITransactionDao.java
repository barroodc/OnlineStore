package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.purchase.Transaction;

import java.util.List;

public interface ITransactionDao {
    List<Transaction> getAllTransactions();
    Transaction getTransactionByID(Long id);
    void updateTransaction(Transaction transaction);
    void deleteTransaction(Transaction transaction);
}
