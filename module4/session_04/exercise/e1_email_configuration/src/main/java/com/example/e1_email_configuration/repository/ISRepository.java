package com.example.e1_email_configuration.repository;

import com.example.e1_email_configuration.model.S;

public interface ISRepository {
    S findAll();

    void save(S s);
}
