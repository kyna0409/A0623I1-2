package com.example.e1_email_configuration.repository.impl;

import com.example.e1_email_configuration.model.S;
import com.example.e1_email_configuration.repository.ISRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SRepository implements ISRepository {
    S s = new S("English",20,true,"good");
    @Override
    public S findAll() {
        return s;
    }

    @Override
    public void save(S s) {
        this.s = s;
    }
}
