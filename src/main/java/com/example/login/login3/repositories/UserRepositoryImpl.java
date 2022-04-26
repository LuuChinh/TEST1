package com.example.login.login3.repositories;


import com.example.login.login3.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User("trinhloc123",1));
        list.add(new User("trinhloc1234",12));
        return list;
    }

}
