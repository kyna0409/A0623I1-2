package com.example.e1_email_configuration.service;

import com.example.e1_email_configuration.model.S;

public interface ISService {
    S findAll();

    void save(S s);
}
