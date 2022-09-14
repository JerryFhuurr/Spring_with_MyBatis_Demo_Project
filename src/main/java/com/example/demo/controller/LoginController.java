package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/login")
    public User doLogin(User user) {
        User loginUser = userService.getByUserNameAndPassword(user);
        if (loginUser != null) {
            log.info("Login success! Username is " + loginUser.getUserName());
        } else {
            log.error("Login failed");
        }
        return loginUser;
    }

    @RequestMapping("/user/getAll")
    public User getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/user/getUserById")
    public User getUserById(User user) {
        User userGet = userService.getUserById(user);
        if (userGet != null) {
            log.info("User get OK! Info: " + userGet.toString());
        } else {
            log.error("Not found matched user!");
        }
        return userGet;
    }

    @RequestMapping("/user/add")
    public void addUser(User user) {
        userService.addUser(user);
    }

    @RequestMapping("/user/update")
    public User updateUser(User user){
        User userUpdate = userService.updateUser(user);
        if (userUpdate != null) {
            log.info("User update OK! Info: " + userUpdate.toString());
        } else {
            log.error("Not found matched user!");
        }
        return userUpdate;
    }

    @RequestMapping("/user/delete")
    public void deleteUser(User user){
        userService.deleteUser(user);
    }
}
