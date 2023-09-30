package com.example.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ex.entitty.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}
