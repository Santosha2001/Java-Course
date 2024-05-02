package com.logindemo.service;

import com.logindemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public  UserServiceImpl(){
        System.out.println(getClass().getSimpleName());
    }

    @Autowired
    private UserRepository userRepository;


}
