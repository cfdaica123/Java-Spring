package com.dev.project.config.Data;

import com.dev.project.entity.Nationality;
import com.dev.project.repository.NationalityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NationalityInitializer implements CommandLineRunner {

    private final NationalityRepository nationalityRepository;

    public NationalityInitializer(NationalityRepository nationalityRepository) {
        this.nationalityRepository = nationalityRepository;
    }

    @Override
    public void run(String... args) {
        saveNationalityIfNotExists("Vietnam");
        saveNationalityIfNotExists("Japan");
        saveNationalityIfNotExists("South Korea");
        saveNationalityIfNotExists("China");
        saveNationalityIfNotExists("Philippines");
        saveNationalityIfNotExists("Singapore");
    }

    private void saveNationalityIfNotExists(String nationalityName) {
        if (!nationalityRepository.existsByNationalityName(nationalityName)) {
            Nationality nationality = new Nationality();
            nationality.setNationalityName(nationalityName);
            nationalityRepository.save(nationality);
        }
    }
}
