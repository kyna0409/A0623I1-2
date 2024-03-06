package com.example.demo3.service;

import com.example.demo3.entity.Department;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    List<T> findAll();

    Optional<T>findById(Long id);

    Department save(T t);

    void deleteById(Long id);
}
