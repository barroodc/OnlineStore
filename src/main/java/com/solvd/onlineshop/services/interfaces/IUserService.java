package com.solvd.onlineshop.services.interfaces;

import com.solvd.onlineshop.model.user.User;

public interface IUserService<T> {

    User getUserById(long id);
}
