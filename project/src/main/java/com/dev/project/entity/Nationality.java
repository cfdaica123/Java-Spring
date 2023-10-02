package com.dev.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "nationalities")
public class Nationality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nationality_id")
    private Long nationalityId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "nationality_name")
    private String nationalityName;

    // Getters and setters
    public Long getNationalityId() {
        return nationalityId;
    }
    
    public void setNationalityId(Long nationalityId) {
        this.nationalityId = nationalityId;
    }
    
    // Getters and setters for employee
    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    // Getters and setters for nationalityName
    public String getNationalityName() {
        return nationalityName;
    }
    
    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

    @Override
    public String toString() {
        return "Nationality{" +
                "nationalityId=" + nationalityId +
                ", employee=" + employee +
                ", nationalityName='" + nationalityName + '\'' +
                '}';
    }
}
