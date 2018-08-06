package com.steven.springbootweb.controller;

import com.steven.springbootentity.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public List<User> getAllUsers() {
        return generateUser();
    }

    private static List<User> generateUser() {
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1, "steven", 29));
        userList.add(new User(2, "roberto", 30));
        return userList;
    }
}
