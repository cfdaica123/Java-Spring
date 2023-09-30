package com.example.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ex.entitty.User;

public interface UserRepository extends JpaRepository<User, Long> {
   
}

