package com.example.sprintRestExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sprintRestExample.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}