package com.dev.project.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "employment_contracts")
public class EmploymentContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Long contractId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "contract_type")
    private String contractType;

    // Getters and setters
    public Long getContractId() {
        return contractId;
    }
    
    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }
    
    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
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
    
    public String getContractType() {
        return contractType;
    }
    
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return "EmploymentContract{" +
                "contractId=" + contractId +
                ", employee=" + employee +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", contractType='" + contractType + '\'' +
                '}';
    }
    
}
