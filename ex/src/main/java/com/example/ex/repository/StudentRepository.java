package com.example.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ex.entitty.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
