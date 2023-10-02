package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
    
}
