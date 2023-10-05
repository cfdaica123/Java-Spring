package com.dev.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.student_management.entity.GiangVien;

@Repository
public interface GiangVienRepository extends JpaRepository<GiangVien, Long> {
    // custom query goes here
}
