package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.purchase.Invoice;


public interface IInvoiceService<T> {

    Invoice getInvoiceById(long id);
}
