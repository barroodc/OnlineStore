package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.purchase.Transaction;

public interface ITransactionService {

    Transaction getTransactionServiceById(long id);
}
