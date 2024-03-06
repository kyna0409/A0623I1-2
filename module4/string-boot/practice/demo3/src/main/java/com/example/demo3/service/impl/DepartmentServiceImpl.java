package com.example.demo3.service.impl;

import com.example.demo3.entity.Department;
import com.example.demo3.repository.IDepartmentRepository;
import com.example.demo3.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private IDepartmentRepository repository;
    @Override
    public List<Department> findAll() {
        return (List<Department>) repository.findAll();
    }

    @Override
    public Optional<Department> findById(Long id) {
        return repository.findById(id);
    }


    @Override
    public Department save(Department department) {
        repository.save(department);
        return department;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
