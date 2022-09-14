package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User getByUserNameAndPassword(User user);

    //unsure about return type 'User'
    List<User> getAllUsers();

    User getUserById(User user);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

}
