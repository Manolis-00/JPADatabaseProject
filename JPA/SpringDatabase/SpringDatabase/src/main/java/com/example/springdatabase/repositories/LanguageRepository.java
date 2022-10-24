package com.example.springdatabase.repositories;

import com.example.springdatabase.models.Language;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Integer> {
    @Query(value = "SELECT language from Languages as l inner join CountryLanguages as cl on l.language_id = cl.languages.language_id inner join Countries as c on c.country_id=cl.countries.country_id",
            nativeQuery = true)
    public List<Language> getCountryLanguage();

    public Language findLanguagesByLanguage_id(Integer language_id);
    public List<Language> findLanguagesByLanguage(String language);
}
