package com.paas.demo.service;

import com.paas.demo.model.User;

import java.util.List;

public interface IUserService {
    List<User> selectUsersByName(String name);

    int insert(User obj);
}
