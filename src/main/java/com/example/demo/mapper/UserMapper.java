package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {

    User getByUserNameAndPassword(User user);

    //unsure about return type 'User'
    User getAllUsers();
    User getUserById(User user);
    void addUser(User user);
    User updateUser(User user);
    void deleteUser(User user);

}
