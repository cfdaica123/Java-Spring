package com.dev.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entity.TeamMember;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Long> {
    
}
