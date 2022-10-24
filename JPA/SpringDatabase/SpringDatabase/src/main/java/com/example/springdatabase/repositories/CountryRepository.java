package com.example.springdatabase.repositories;

import com.example.springdatabase.models.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {
    @Query(value = "SELECT name, area, country_code2 from Countries order by name where name = 1?",
            nativeQuery = true)
    public List<Country> getCountriesOrderedByName(String name);

    @Query(value = "select c.name, c.country_code3, cs.year, cs.population, cs.gdp from Countries as c inner join CountryStats as cs on c.country_id=cs.countries.country_id having max(cs.gdp/cs.population)",
            nativeQuery = true)
    public List<Country> getCountriesByMaxGDPPerPopulation();

    @Query(value = "select con.name, reg.name, c.name, cs.year, cs.population, cs.gdp from Countries as c inner join CountryStats as cs on c.country_id=cs.countries.country_id inner join Regions as reg on c.region_id=reg.region_id inner join Continents as con on reg.continents.continent_id=con.continent_id where reg.name = ?1 and between cs.year=?1 and cs.year=?1 ",
            nativeQuery = true)
    public List<Country> getCountriesByRegionNameAndYear();

    public Country findCountriesByCountry_id(Integer country_id);
    public Country findCountriesByName(String name);
    public List<Country> findCountriesByNational_day(Date national_day);
    public Country findCountriesByCountry_code2(String country_code2);
    public Country findCountriesByCountry_code3(String country_code3);
    public List<Country> findCountriesByRegion_id(Integer region_id);
}
