package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Office;

public interface OfficeRepository extends JpaRepository<Office, Long> {
    
}
