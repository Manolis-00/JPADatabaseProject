package com.example.springdatabase.controllers;

import com.example.springdatabase.models.CountryStat;
import com.example.springdatabase.services.CountryStatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryStatController {
    private CountryStatService countryStatService;

    public CountryStatController(CountryStatService countryStatService) {
        this.countryStatService = countryStatService;
    }
    @GetMapping(path = "/CountryStats/{country_id}")
    public CountryStat getCountryId(@PathVariable("country_id") int country_id) {
        return countryStatService.getCountryId(country_id);
    }

    @GetMapping(path = "/CountryStats/{year}")
    public CountryStat getCountryStatsByYear(@PathVariable ("year") Integer year) {
        return countryStatService.getCountryStatsByYear(year);
    }

    @GetMapping(path = "/CountryStats/{population}")
    public List<CountryStat> getCountryStatsByPopulation(Integer population) {
        return countryStatService.getCountryStatsByPopulation(population);
    }

    @GetMapping(path = "/CountryStats/{gdp}")
    public List<CountryStat> getCountryStatsByGDP(Long gdp) {
        return countryStatService.getCountryStatsByGDP(gdp);
    }
}
