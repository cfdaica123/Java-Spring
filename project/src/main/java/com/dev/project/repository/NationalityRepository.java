package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Nationality;

public interface NationalityRepository extends JpaRepository<Nationality, Long> {
    
}
