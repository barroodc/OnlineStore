package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IInvoiceDao;
import com.solvd.onlineshop.purchase.Invoice;

import java.util.List;

public class InvoiceDaoImpl implements IInvoiceDao {

    private List<Invoice> invoices;

    public InvoiceDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return null;
    }

    @Override
    public Invoice getInvoiceByID(Long id) {
        return null;
    }

    @Override
    public void addInvoice(Invoice invoice) {

    }

    @Override
    public void deleteInvoice(Invoice invoice) {

    }
}
