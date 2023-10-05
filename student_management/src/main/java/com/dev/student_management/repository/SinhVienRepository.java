package com.dev.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.student_management.entity.SinhVien;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Long> {
    // custom query goes here
}

