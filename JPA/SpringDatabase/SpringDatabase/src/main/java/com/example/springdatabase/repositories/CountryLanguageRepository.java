package com.example.springdatabase.repositories;

import com.example.springdatabase.models.CountryLanguage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, Integer> {
    @Query("Select a from Country a where a.country_id = ?1")
    public CountryLanguage findCountryLanguageByCountryId(int country_id);

    @Query("Select a from Language a where a.language_id = ?1")
    public CountryLanguage findCountryLanguageByLanguage_id(int language_id);

    public CountryLanguage findCountryLanguagesByCountryId(Integer country_id);
    public CountryLanguage findCountryLanguagesByLanguage_Id(Integer language_id);
    public List<CountryLanguage> findCountryLanguagesByOfficial(int official);
}
