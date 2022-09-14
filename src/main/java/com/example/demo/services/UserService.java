package com.example.demo.services;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    User getByUserNameAndPassword(User user);

    List<User> getAllUsers();

    User getUserById(User user);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
