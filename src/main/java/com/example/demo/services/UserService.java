package com.example.demo.services;

import com.example.demo.model.User;

public interface UserService {
    User getByUserNameAndPassword(User user);
    User getAllUsers();
    User getUserById(User user);
    void addUser(User user);
    User updateUser(User user);
    void deleteUser(User user);
}
