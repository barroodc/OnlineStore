package com.solvd.onlineshop.dao;

public interface IBaseDao<T> {
    void createEntity(T entity);
    void updateEntity(T entity);
    T getEntityById(long id);
    void deleteEntity(long id);
}
