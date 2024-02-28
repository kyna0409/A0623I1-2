package com.example.e1_email_configuration.service.impl;

import com.example.e1_email_configuration.model.S;
import com.example.e1_email_configuration.repository.ISRepository;
import com.example.e1_email_configuration.service.ISService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class SService implements ISService {
    @Autowired
    private ISRepository repository;

    @Override
    public S findAll() {
        return repository.findAll();
    }

    @Override
    public void save(S s) {
        repository.save(s);
    }
}
