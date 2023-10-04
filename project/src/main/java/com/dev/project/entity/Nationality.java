// Nationality.java
package com.dev.project.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "nationalities")
public class Nationality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nationality_id")
    private Long nationalityId;

    @Column(name = "nationality_name", unique = true)
    private String nationalityName;

    @OneToMany(mappedBy = "nationality")
    private List<Employee> employees;

    // Getter và setter
    public Long getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Long nationalityId) {
        this.nationalityId = nationalityId;
    }

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
                ", nationalityName='" + nationalityName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
