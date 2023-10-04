package com.dev.project.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "salaries")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private Long salaryId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "advance_amount")
    private BigDecimal advanceAmount;

    @Column(name = "advance_date")
    private LocalDate advanceDate;

    @Column(name = "net_salary")
    private BigDecimal netSalary;

    @Column(name = "total_salary")
    private BigDecimal totalSalary;

    // Getters and setters
    public Long getSalaryId() {
        return salaryId;
    }
    public void setSalaryId(Long salaryId) {
        this.salaryId = salaryId;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salaryId=" + salaryId +
                ", employee=" + employee +
                ", amount=" + amount +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", advanceAmount=" + advanceAmount +
                ", advanceDate=" + advanceDate +
                ", netSalary=" + netSalary +
                ", totalSalary=" + totalSalary +
                '}';
    }
}
