package com.dev.project.config.Data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dev.project.entity.City;
import com.dev.project.repository.CityRepository;

@Component
public class CityInitializer implements CommandLineRunner {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void run(String... args) throws Exception {
        // Thêm các thành phố nếu chưa tồn tại
        List<String> cityNames = Arrays.asList("Ho Chi Minh", "Da Nang", "Hue", "Ha Noi");

        for (String cityName : cityNames) {
            City existingCity = cityRepository.findByCityName(cityName);
            if (existingCity == null) {
                City city = new City();
                city.setCityName(cityName);
                cityRepository.save(city);
            }
        }
    }
}