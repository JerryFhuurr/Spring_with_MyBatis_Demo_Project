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


}
