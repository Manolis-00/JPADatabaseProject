package com.example.springdatabase.services;

import com.example.springdatabase.models.*;
import com.example.springdatabase.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CountriesService {
    private final CountryRepository countryRepository;

    public CountriesService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountriesByName(String name) {
        return countryRepository.getCountriesOrderedByName(name);
    }

    public List<Country> getCountriesByGDPPerPopulation(Country country, CountryStat countryStat) {
        return countryRepository.getCountriesByMaxGDPPerPopulation();
    }

    public List<Country> getColumns(Continent continent, Region region, Country country, CountryStat countryStat) {
        return countryRepository.getCountriesByRegionNameAndYear();
    }

    public Country getCountriesByCountryID(Integer country_id) {
        return countryRepository.findCountriesByCountry_id(country_id);
    }

    public Country getCountryByName(String name) {
        return countryRepository.findCountriesByName(name);
    }

    public List<Country> getCountriesByNationalDay(Date national_day) {
        return countryRepository.findCountriesByNational_day(national_day);
    }

    public Country getCountriesByCountryCode2(String countryCode2) {
        return countryRepository.findCountriesByCountry_code2(countryCode2);
    }

    public Country getCountriesByCountryCode3(String countryCode3) {
        return countryRepository.findCountriesByCountry_code3(countryCode3);
    }

    public List<Country> getCountriesByRegionID(Integer regionId) {
        return countryRepository.findCountriesByRegion_id(regionId);
    }
}
