package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {
    
}
