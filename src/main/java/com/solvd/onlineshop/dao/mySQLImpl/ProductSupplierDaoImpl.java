package com.solvd.onlineshop.dao.mySQLImpl;

import com.solvd.onlineshop.dao.IProductSupplierDao;
import com.solvd.onlineshop.product.ProductSupplier;

import java.util.List;

public class ProductSupplierDaoImpl implements IProductSupplierDao {

    private List<ProductSupplier> productSuppliers;

    public ProductSupplierDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public List<ProductSupplier> getSupplierName() {
        return null;
    }

    @Override
    public ProductSupplier getSupplierByID(Long id) {
        return null;
    }

    @Override
    public void addSupplier(ProductSupplier productSupplier) {

    }

    @Override
    public void deleteSupplier(ProductSupplier productSupplier) {

    }
}
