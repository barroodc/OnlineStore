package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.purchase.Invoice;
import com.solvd.onlineshop.model.purchase.Transaction;

import java.sql.Date;
import java.util.List;


public interface ITransactionDao extends IBaseDao<Transaction> {
    List<Transaction> getAllTransactionsByID(long id);
}
