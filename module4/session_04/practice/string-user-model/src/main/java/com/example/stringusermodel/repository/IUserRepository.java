package com.example.stringusermodel.repository;

import com.example.stringusermodel.model.Login;
import com.example.stringusermodel.model.User;

public interface IUserRepository {
    User checkLogin(Login login);
}
