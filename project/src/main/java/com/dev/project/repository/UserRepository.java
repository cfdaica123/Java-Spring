package com.dev.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    
}
