package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IProductSupplierDao;
import com.solvd.onlineshop.model.product.ProductSupplier;

import java.util.List;

public class ProductSupplierDaoImpl extends BaseDaoImpl<ProductSupplier> implements IProductSupplierDao {

    private List<ProductSupplier> productSuppliers;

    public ProductSupplierDaoImpl() {
        //arraylist will be initialized here.
    }

    @Override
    public void createEntity(ProductSupplier entity) {

    }

    @Override
    public void updateEntity(ProductSupplier entity) {

    }

    @Override
    public ProductSupplier getEntityById(Long id) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {

    }

}
