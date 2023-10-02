package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
    
}
