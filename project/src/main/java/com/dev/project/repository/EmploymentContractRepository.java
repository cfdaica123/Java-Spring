package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.EmploymentContract;

public interface EmploymentContractRepository extends JpaRepository<EmploymentContract, Long> {
    
}