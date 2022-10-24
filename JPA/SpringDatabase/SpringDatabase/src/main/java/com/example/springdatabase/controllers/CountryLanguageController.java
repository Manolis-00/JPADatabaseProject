package com.example.springdatabase.controllers;

import com.example.springdatabase.models.CountryLanguage;
import com.example.springdatabase.services.CountryLanguageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryLanguageController {
    private CountryLanguageService countryLanguageService;

    public CountryLanguageController(CountryLanguageService countryLanguageService) {
        this.countryLanguageService = countryLanguageService;
    }

    @GetMapping(path = "/CountryLanguages/{country_id}")
    public CountryLanguage getCountryId(@PathVariable("country_id") int country_id) {
        return countryLanguageService.getCountryLanguageByCountryId(country_id);
    }

    @GetMapping(path = "/CountryLanguages/{language_id}")
    public CountryLanguage getLanguageId(@PathVariable("language_id") int language_id) {
        return countryLanguageService.getLanguageByLanguageId(language_id);
    }

    @GetMapping(path = "/CountryLanguages/{country_id}")
    public CountryLanguage getLanguageByCountryId(@PathVariable ("country_id") Integer country_id) {
        return countryLanguageService.getLanguageByCountryId(country_id);
    }

    @GetMapping(path = "/CountryLanguages/{language_id}")
    public CountryLanguage getCountryLanguage(@PathVariable ("language_id") Integer language_id) {
        return countryLanguageService.getCountryLanguageByLanguageId(language_id);
    }

    @GetMapping(path = "/CountryLanguages/{official}")
    public List<CountryLanguage> countryLanguagesByOfficial(@PathVariable ("official") int official) {
        return countryLanguageService.getCountryLanguagesByOfficial(official);
    }
}
