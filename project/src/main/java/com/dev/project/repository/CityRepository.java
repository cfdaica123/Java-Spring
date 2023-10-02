package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.City;

public interface CityRepository extends JpaRepository<City, Long> {
    
}
