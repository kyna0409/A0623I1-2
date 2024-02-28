package com.example.stringusermodel.service.impl;

import com.example.stringusermodel.model.Login;
import com.example.stringusermodel.model.User;
import com.example.stringusermodel.repository.IUserRepository;
import com.example.stringusermodel.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository repository;
    @Override
    public User checkLogin(Login login) {
        return repository.checkLogin(login);
    }
}
