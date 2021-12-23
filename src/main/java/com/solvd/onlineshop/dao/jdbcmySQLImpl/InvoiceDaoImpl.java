package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IInvoiceDao;
import com.solvd.onlineshop.model.purchase.Invoice;

import java.util.List;

public class InvoiceDaoImpl extends BaseDaoImpl<Invoice> implements IInvoiceDao {

    private List<Invoice> invoices;

    public InvoiceDaoImpl() {

    }

    @Override
    public void createEntity(Invoice entity) {

    }

    @Override
    public void updateEntity(Invoice entity) {

    }

    @Override
    public Invoice getEntityById(long id) {
        return null;
    }

    @Override
    public void deleteEntity(long id) {

    }

    @Override
    public void inStock(byte[] isInStock) {

    }

    @Override
    public List<Invoice> getPaymentInformation() {
        return null;
    }
}
