package com.example.stringusermodel.service;

import com.example.stringusermodel.model.Login;
import com.example.stringusermodel.model.User;

public interface IUserService {
    User checkLogin(Login login);
}
