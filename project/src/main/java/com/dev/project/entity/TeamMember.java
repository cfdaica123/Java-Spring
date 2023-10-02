package com.dev.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "team_members")
public class TeamMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamMemberId;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Getters and setters
    public Long getTeamMemberId() {
        return teamMemberId;
    }
    
    public void setTeamMemberId(Long teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "teamMemberId=" + teamMemberId +
                ", team=" + team +
                ", employee=" + employee +
                '}';
    }
}
