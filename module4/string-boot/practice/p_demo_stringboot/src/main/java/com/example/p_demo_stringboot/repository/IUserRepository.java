package com.example.p_demo_stringboot.repository;

import com.example.p_demo_stringboot.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
}
