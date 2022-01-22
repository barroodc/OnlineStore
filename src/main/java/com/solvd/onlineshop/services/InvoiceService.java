package com.solvd.onlineshop.services;

import com.solvd.onlineshop.dao.jdbcmySQLImpl.InventoryDao;
import com.solvd.onlineshop.dao.jdbcmySQLImpl.InvoiceDao;
import com.solvd.onlineshop.model.product.Inventory;
import com.solvd.onlineshop.model.purchase.Invoice;
import com.solvd.onlineshop.services.interfaces.IInvoiceService;
import com.solvd.onlineshop.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class InvoiceService implements IInvoiceService<Invoice> {

    private static final Logger LOGGER = LogManager.getLogger(InvoiceService.class);
    private static final InvoiceDao invoiceDao;
    private static Invoice invoice;

    static {
        invoiceDao = new InvoiceDao();
        invoice = null;
    }

    @Override
    public Invoice getInvoiceById(long id) {
        try {
            invoice = (Invoice) invoiceDao.getAllInvoicesByID(id);
            LOGGER.info(invoice);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return null;
    }
}
