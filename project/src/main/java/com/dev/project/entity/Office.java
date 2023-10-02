package com.dev.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "offices")
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "office_id")
    private Long officeId;

    @Column(name = "office_name")
    private String officeName;

    @Column(name = "location")
    private String location;

    @OneToMany(mappedBy = "office")
    private List<Employee> employees;

    // Getters and setters
    public Long getOfficeId() {
        return officeId;
    }
    
    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }
    
    public String getOfficeName() {
        return officeName;
    }
    
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public List<Employee> getEmployees() {
        return employees;
    }
    
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeId=" + officeId +
                ", officeName='" + officeName + '\'' +
                ", location='" + location + '\'' +
                ", employees=" + employees +
                '}';
    }
}
