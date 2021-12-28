package com.Servicecenter.service;

import com.Servicecenter.model.User;

import java.util.List;

public interface UserService {
    public User register();
    public Boolean login();
    public List<User> getAll();
    public User getUserByName(String name);
    public User editUser(int id, User user);

    }
