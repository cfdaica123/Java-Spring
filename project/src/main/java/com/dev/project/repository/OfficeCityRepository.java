package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.OfficeCity;

public interface OfficeCityRepository extends JpaRepository<OfficeCity, Long> {
    
}
