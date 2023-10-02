package com.dev.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "lecturers")
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecturer_id")
    private Long lecturerId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "subject_taught")
    private String subjectTaught;

    // Getters and setters
    public Long getLecturerId() {
        return lecturerId;
    }
    
    public void setLecturerId(Long lecturerId) {
        this.lecturerId = lecturerId;
    }
    
    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public String getSubjectTaught() {
        return subjectTaught;
    }
    
    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecturerId=" + lecturerId +
                ", employee=" + employee +
                ", subjectTaught='" + subjectTaught + '\'' +
                '}';
    }
}
