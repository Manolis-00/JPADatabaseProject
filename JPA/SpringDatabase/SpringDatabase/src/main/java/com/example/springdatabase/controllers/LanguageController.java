package com.example.springdatabase.controllers;

import com.example.springdatabase.models.Country;
import com.example.springdatabase.models.CountryLanguage;
import com.example.springdatabase.models.Language;
import com.example.springdatabase.services.LanguageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {
    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping(path = "/Languages/{Languages, CountryLanguages, Countries}")
    public List<Language> getJoinedColumns(@PathVariable("languages, countryLanguages, countries") Language language,
                                           CountryLanguage countryLanguage, Country country) {
        return languageService.getLanguage(language, countryLanguage, country);
    }

    @GetMapping(path = "/Languages/{language_id}")
    public Language findLanguagesByLanguage_id(@PathVariable ("language_id") Integer language_id) {
        return languageService.findLanguagesByLanguage_id(language_id);
    }

    @GetMapping(path = "/Languages/{language}")
    public List<Language> findLanguagesByLanguage(@PathVariable ("language") String language) {
        return languageService.findLanguagesByLanguage(language);
    }

}
