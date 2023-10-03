package com.dev.project.config.Data;

import com.dev.project.entity.Language;
import com.dev.project.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LanguageInitializer implements CommandLineRunner {

    private final LanguageRepository languageRepository;

    @Autowired
    public LanguageInitializer(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        initializeLanguages();
    }

    private void initializeLanguages() {
        String[] programmingLanguages = {"Java", "Python", "JavaScript", "Php", "C#", "Ruby", "Swift"};

        Arrays.stream(programmingLanguages)
                .forEach(languageName -> {
                    Language language = new Language();
                    language.setLanguageName(languageName);
                    languageRepository.save(language);
                });
    }
}
