package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.purchase.Invoice;

import java.util.List;

public interface IInvoiceDao {

    List<Invoice> getAllInvoices();
    Invoice getInvoiceByID(long id);
    void addInvoice(Invoice invoice);
    void deleteInvoice(Invoice invoice);
}
