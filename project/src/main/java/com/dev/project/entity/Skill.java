package com.dev.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    private String skillName;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Getters and setters
    public Long getSkillId() {
        return skillId;
    }
    
    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }
    
    // Getters and setters for skillName
    public String getSkillName() {
        return skillName;
    }
    
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    
    // Getters and setters for employee
    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillId=" + skillId +
                ", employee=" + employee +
                ", skillName='" + skillName + '\'' +
                '}';
    }
}
