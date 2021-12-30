package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.services.InvoiceService;

public interface IInvoiceService<T> {

    InvoiceService getInvoiceById(long id);
}
