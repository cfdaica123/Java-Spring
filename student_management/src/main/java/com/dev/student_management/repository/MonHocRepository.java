package com.dev.student_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.student_management.entity.MonHoc;

@Repository
public interface MonHocRepository extends JpaRepository<MonHoc, Long> {
    // custom query goes here
    @Query("SELECT m FROM MonHoc m JOIN FETCH m.giangVien")
    List<MonHoc> findAllWithGiangVien();
}
