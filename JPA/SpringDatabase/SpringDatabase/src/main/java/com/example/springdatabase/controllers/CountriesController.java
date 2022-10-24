package com.example.springdatabase.controllers;

import com.example.springdatabase.models.*;
import com.example.springdatabase.services.CountriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class CountriesController {
    private CountriesService countriesService;

    public CountriesController(CountriesService countriesService) {
        this.countriesService = countriesService;
    }

    @GetMapping(path = "/Countries/{name}")
    public List<Country> getCountryName(@PathVariable ("name") String name) {
        return countriesService.getCountriesByName(name);
    }

    @GetMapping(path = "/Countries/{Countries, CountryStats}")
    public List<Country> getCountriesByMaxGDPPerPopulation(@PathVariable ("countries, countryStats") Country country,
                                                           CountryStat countryStat) {
        return countriesService.getCountriesByGDPPerPopulation(country, countryStat);
    }

    @GetMapping(path = "/Countries/{Continents, Regions, Countries, CountryStats}")
    public List<Country> getCountriesByRegionNameAndYear (@PathVariable ("continents, regions, countries, countryStats")
                                                                Continent continent, Region region, Country country,
                                                          CountryStat countryStat) {
        return countriesService.getColumns(continent, region, country, countryStat);
    }

    @GetMapping(path = "/Countries/{country_id}")
    public Country getCountriesByCountryID(@PathVariable ("country_id") Integer country_id) {
        return countriesService.getCountriesByCountryID(country_id);
    }

    @GetMapping(path = "/Countries/{name}")
    public Country getCountryByName(@PathVariable ("name") String name) {
        return countriesService.getCountryByName(name);
    }

    @GetMapping(path = "/Countries/{national_day}")
    public List<Country> getCountriesByNationalDay(@PathVariable ("national_day") Date national_day) {
        return countriesService.getCountriesByNationalDay(national_day);
    }

    @GetMapping(path = "/Countries/{countryCode2}")
    public Country getCountriesByCountryCode2(@PathVariable ("countryCode2") String countryCode2) {
        return countriesService.getCountriesByCountryCode2(countryCode2);
    }

    @GetMapping(path = "/Countries/{countryCode3}")
    public Country getCountriesByCountryCode3(@PathVariable ("countryCode3") String countryCode3) {
        return countriesService.getCountriesByCountryCode3(countryCode3);
    }

    @GetMapping(path = "/Countries/{regionId}")
    public List<Country> getCountriesByRegionID(@PathVariable ("regionId") Integer regionId) {
        return countriesService.getCountriesByRegionID(regionId);
    }
}
