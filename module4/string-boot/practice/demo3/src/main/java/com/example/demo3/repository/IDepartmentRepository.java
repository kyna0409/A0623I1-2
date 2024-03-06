package com.example.demo3.repository;

import com.example.demo3.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends CrudRepository<Department,Long> {
}
