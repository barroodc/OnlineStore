package com.solvd.onlineshop.dao;

import com.solvd.onlineshop.model.purchase.Order;

import java.sql.Date;
import java.util.List;
import java.util.Map;


public interface IOrderDao extends IBaseDao<Order> {
  List<Order> getOtherCustomerInformation(long id);
  Map<Date, String> timePlacedAndStatus();
}
