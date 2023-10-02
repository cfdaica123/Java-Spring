package com.dev.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    private String cityName;

    @OneToMany(mappedBy = "city")
    private List<OfficeCity> officeCities;

    // Getters and setters
    public Long getCityId() {
        return cityId;
    }
    
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
    
    public String getCityName() {
        return cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public List<OfficeCity> getOfficeCities() {
        return officeCities;
    }
    
    public void setOfficeCities(List<OfficeCity> officeCities) {
        this.officeCities = officeCities;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", officeCities=" + officeCities +
                '}';
    }
}
