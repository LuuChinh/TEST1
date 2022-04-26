package com.example.login.login3.controllers;

import com.example.login.login3.model.User;
import com.example.login.login3.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@Component
//@EnableJpaRepositories("domain.repositroy-package")
@RestController
@RequestMapping(path="/api/login")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("")
    public List<User> getAllUser(){
//        return List.of(
//                new User(1L,"trinhloc123","12345f"),
//                new User(1L,"trinhloc123","12345f")
//        );
        return null;

    }
}
