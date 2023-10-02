package com.dev.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "offices_cities")
public class OfficeCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "office_city_id")
    private Long officeCityId;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    // Getters and setters
    public Long getOfficeCityId() {
        return officeCityId;
    }
    
    public void setOfficeCityId(Long officeCityId) {
        this.officeCityId = officeCityId;
    }
    
    public Office getOffice() {
        return office;
    }
    
    public void setOffice(Office office) {
        this.office = office;
    }
    
    public City getCity() {
        return city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "OfficeCity{" +
                "officeCityId=" + officeCityId +
                ", office=" + office +
                ", city=" + city +
                '}';
    }
}
