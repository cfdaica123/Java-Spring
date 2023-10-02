package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
