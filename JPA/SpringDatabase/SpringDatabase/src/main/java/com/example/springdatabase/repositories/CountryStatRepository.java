package com.example.springdatabase.repositories;

import com.example.springdatabase.models.CountryStat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryStatRepository extends CrudRepository<CountryStat, Integer> {

    @Query("Select a from Country a where a.country_id = ?1")
    public CountryStat findCountryStatByCountryId(int country_id);
    public CountryStat findCountryStatsByYear(Integer year);
    public List<CountryStat> findCountryStatsByPopulation(Integer population);
    public List<CountryStat> findCountryStatsByGdp(Long gdp);
}
