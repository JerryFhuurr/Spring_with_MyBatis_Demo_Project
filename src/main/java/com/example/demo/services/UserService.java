package com.example.demo.services;

import com.example.demo.model.User;

public interface UserService {
    User getByUserNameAndPassword(User user);
}
