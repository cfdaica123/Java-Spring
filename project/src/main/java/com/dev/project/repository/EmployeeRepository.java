package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
