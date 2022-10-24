package com.example.springdatabase.services;

import com.example.springdatabase.models.CountryLanguage;
import com.example.springdatabase.repositories.CountryLanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {
    private final CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public CountryLanguage getCountryLanguageByCountryId(int country_id) {
        return countryLanguageRepository.findCountryLanguageByCountryId(country_id);
    }

    public CountryLanguage getLanguageByLanguageId(int language_id) {
        return countryLanguageRepository.findCountryLanguageByLanguage_id(language_id);
    }

    public CountryLanguage getLanguageByCountryId(Integer country_id) {
        return countryLanguageRepository.findCountryLanguagesByCountryId(country_id);
    }

    public CountryLanguage getCountryLanguageByLanguageId(Integer language_id) {
        return countryLanguageRepository.findCountryLanguagesByLanguage_Id(language_id);
    }

    public List<CountryLanguage> getCountryLanguagesByOfficial(int official) {
        return countryLanguageRepository.findCountryLanguagesByOfficial(official);
    }
}
