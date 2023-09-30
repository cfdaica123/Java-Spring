package com.example.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ex.entitty.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
