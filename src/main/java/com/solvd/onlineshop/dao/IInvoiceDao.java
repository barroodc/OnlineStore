package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.purchase.Invoice;

import java.util.List;

public interface IInvoiceDao extends IBaseDao<Invoice> {
    List<Invoice> getAllInvoicesByID(long id);
}
