package com.solvd.onlineshop.dao;

import java.util.List;

public interface IBaseDao<T> {
    T findById(long id);
    List<T> findAll();
    T update(T dto);
    T create(T dto);
    void delete(long id);
}
