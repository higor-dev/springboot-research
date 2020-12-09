package com.springboot.springbootwork.services;

import com.springboot.springbootwork.entities.User;
import com.springboot.springbootwork.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }




}
