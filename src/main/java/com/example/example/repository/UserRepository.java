package com.example.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.example.model.User;

public interface UserRepository  extends CrudRepository<User, Long>{
    List<User> findByName(String lastName);
}