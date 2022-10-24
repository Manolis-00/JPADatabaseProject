package com.example.springdatabase.services;

import com.example.springdatabase.models.Country;
import com.example.springdatabase.models.CountryLanguage;
import com.example.springdatabase.models.Language;
import com.example.springdatabase.repositories.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    private final LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    public List<Language> getLanguage(Language language, CountryLanguage countryLanguage, Country country) {
        return languageRepository.getCountryLanguage();
    }

    public Language findLanguagesByLanguage_id(Integer language_id) {
        return languageRepository.findLanguagesByLanguage_id(language_id);
    }

    public List<Language> findLanguagesByLanguage(String language) {
        return languageRepository.findLanguagesByLanguage(language);
    }
}
