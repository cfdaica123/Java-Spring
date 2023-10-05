package com.dev.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.student_management.entity.Diem;

@Repository
public interface DiemRepository extends JpaRepository<Diem, Long> {
    // custom query goes here
}

