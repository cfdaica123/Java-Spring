package com.dev.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Long languageId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "language_name")
    private String languageName;

    // Getters and setters
    public Long getLanguageId() {
        return languageId;
    }
    
    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }
    
    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public String getLanguageName() {
        return languageName;
    }
    
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId +
                ", employee=" + employee +
                ", languageName='" + languageName + '\'' +
                '}';
    }
}
