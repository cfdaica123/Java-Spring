package com.example.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ex.entitty.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
   
}