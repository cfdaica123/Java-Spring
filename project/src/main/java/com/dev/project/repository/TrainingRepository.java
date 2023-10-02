package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Training;

public interface TrainingRepository extends JpaRepository<Training, Long> {
    
}
