package com.example.demo.services.Impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getByUserNameAndPassword(User user) {
        User loginUser = userMapper.getByUserNameAndPassword(user);
        return loginUser;
    }

    @Override
    public User getAllUsers() {
        User users = userMapper.getAllUsers();
        return users;
    }

    @Override
    public User getUserById(User user) {
        User userGet = userMapper.getUserById(user);
        return userGet;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        User userUpdated = userMapper.updateUser(user);
        return userUpdated;
    }

    @Override
    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }
}
