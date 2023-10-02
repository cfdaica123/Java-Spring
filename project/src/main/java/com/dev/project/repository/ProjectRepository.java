package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
