package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.ProductSupplierDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.TransactionDao;
import com.solvd.onlineshop.model.product.ProductSupplier;
import com.solvd.onlineshop.model.purchase.Transaction;
import com.solvd.onlineshop.services.interfaces.ITransactionService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class TransactionService implements ITransactionService<Transaction> {

    private static final Logger LOGGER = LogManager.getLogger(TransactionService.class);
    private static final TransactionDao transactionDao;
    private static Transaction transaction;

    static {
        transactionDao = new TransactionDao();
        transaction = null;
    }

    @Override
    public Transaction getTransactionServiceById(long id) {
        try {
            transaction = (Transaction) transactionDao.getAllTransactionsByID(id);
            LOGGER.info(transaction);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
