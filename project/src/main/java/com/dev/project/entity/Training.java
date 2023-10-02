package com.dev.project.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trainings")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private String trainingName;

    private Date startDate;

    private Date endDate;

    // Getters and setters
    public Long getTrainingId() {
        return trainingId;
    }
    
    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }
    
    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public String getTrainingName() {
        return trainingName;
    }
    
    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Date getEndDate() {
        return endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Training{" +
                "trainingId=" + trainingId +
                ", employee=" + employee +
                ", trainingName='" + trainingName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
