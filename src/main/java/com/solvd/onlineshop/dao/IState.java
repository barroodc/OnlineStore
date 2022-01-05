package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.location.State;

import java.util.List;

public interface IState extends IBaseDao<State> {
    List<State> getStateByID(long id);
}
