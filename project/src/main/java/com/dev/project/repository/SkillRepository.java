package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    
}
