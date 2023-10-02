package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
    
}
