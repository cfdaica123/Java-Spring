package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}
