package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
