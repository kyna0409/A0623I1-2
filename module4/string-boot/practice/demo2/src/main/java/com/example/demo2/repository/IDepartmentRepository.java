package com.example.demo2.repository;

import com.example.demo2.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends CrudRepository<Department,Long> {
}
