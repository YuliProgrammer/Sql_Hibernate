package com.dolnikova.dao;

import com.dolnikova.model.User;

import java.util.List;

public interface Storage {

    void addUser(User user);
    void updateUser(User user);

    int removeAll();
    void removeUser(int id);
    void removeUserByName(String name);
    void delete(User user);

    User getUser(int id);
    User getByName(String name);
    List<User> getByAge(int from, int to);
    List<User> getAllUsers();
}