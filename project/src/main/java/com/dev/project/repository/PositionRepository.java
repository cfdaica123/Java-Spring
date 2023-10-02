package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
    
}
