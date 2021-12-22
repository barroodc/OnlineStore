package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.purchase.Invoice;

import java.util.List;

public interface IInvoiceDao extends IBaseDao<Invoice> {

    void inStock(byte[] isInStock);
    List<Invoice> getPaymentInformation();
}
