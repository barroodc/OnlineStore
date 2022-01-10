package com.solvd.onlineshop.services;

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

    private static final Logger logger = LogManager.getLogger(TransactionService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Transaction> transactionList;

    @Override
    public Transaction getTransactionServiceById(long id) {
        Transaction transaction = null;
        AtomicReference<String> select = new AtomicReference<>("select * from transaction where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long userID = resultSet.getLong("user_id");
                    String status = resultSet.getString("status");
                    Date timeCreated = resultSet.getDate("time_created");
                    String approvalStatus = resultSet.getString("approval_status");
                    transaction = new Transaction(id, userID, status, timeCreated, approvalStatus);
                    transactionList.add(transaction);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return transaction;
    }
}
