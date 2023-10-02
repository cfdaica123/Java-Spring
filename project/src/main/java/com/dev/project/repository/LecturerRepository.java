package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {
    
}