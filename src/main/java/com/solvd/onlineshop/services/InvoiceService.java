package com.solvd.onlineshop.services;

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

    private static final Logger logger = LogManager.getLogger(InvoiceService.class);
    private static PreparedStatement preparedStatement;
    private static CopyOnWriteArrayList<Invoice> invoiceList;

    @Override
    public Invoice getInvoiceById(long id) {
        Invoice invoice = null;
        AtomicReference<String> select = new AtomicReference<>("select * from invoice where id = ?");
        try(Connection c = ConnectionPool.getConnection()) {
            preparedStatement = c.prepareStatement(select.get());
            preparedStatement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getLong("id");
                    Long transactionID = resultSet.getLong("transaction_id");
                    long inventoryID = resultSet.getLong("inventory_id");
                    byte[] isInStock = resultSet.getBytes("is_in_stock");
                    float price = resultSet.getFloat("price");
                    float discount = resultSet.getFloat("discount");
                    float preTax = resultSet.getFloat("pre_tax");
                    float tax = resultSet.getFloat("tax");
                    float subTotal = resultSet.getFloat("subtotal");
                    invoice = new Invoice(id, transactionID, inventoryID, isInStock, price, discount, preTax, tax, subTotal);
                    invoiceList.add(invoice);
                }

            } catch (Exception e) {
                logger.error(e);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return invoice;
    }
}
