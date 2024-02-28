package com.example.e2.service.impl;

import com.example.e2.repository.IRepository;
import com.example.e2.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TService implements IService {
    @Autowired
    IRepository repository;

    @Override
    public String check_tr(String s) {
        return repository.check_tr(s);
    }
}
