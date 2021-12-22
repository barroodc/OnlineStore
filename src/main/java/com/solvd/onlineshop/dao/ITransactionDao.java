package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.purchase.Transaction;

import java.sql.Date;


public interface ITransactionDao extends IBaseDao<Transaction> {
    Transaction getTransactionCycle(Date timeCreated,String status, String approvalStatus);
}
