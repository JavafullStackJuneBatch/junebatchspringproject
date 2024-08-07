package com.example.junebatchspringproject.services;

import com.example.junebatchspringproject.entity.User1;
import com.example.junebatchspringproject.repository.User1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User1Service {
    @Autowired
    User1Repository user1Repository;

    public User1 createUser(User1 user) {
        return user1Repository.save(user);
    }
}
