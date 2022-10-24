package com.example.springdatabase.services;

import com.example.springdatabase.models.CountryStat;
import com.example.springdatabase.repositories.CountryStatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryStatService {
    private final CountryStatRepository countryStatRepository;

    public CountryStatService(CountryStatRepository countryStatRepository) {
        this.countryStatRepository = countryStatRepository;
    }

    public CountryStat getCountryId(int country_id) {
        return countryStatRepository.findCountryStatByCountryId(country_id);
    }

    public CountryStat getCountryStatsByYear(Integer year) {
        return countryStatRepository.findCountryStatsByYear(year);
    }

    public List<CountryStat> getCountryStatsByPopulation(Integer population) {
        return countryStatRepository.findCountryStatsByPopulation(population);
    }

    public List<CountryStat> getCountryStatsByGDP(Long gdp) {
        return countryStatRepository.findCountryStatsByGdp(gdp);
    }
}
