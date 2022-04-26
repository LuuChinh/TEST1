package com.example.login.login3.repositories;

import com.example.login.login3.controllers.UserController;
import com.example.login.login3.model.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {

    List<User> getListUser();

}
