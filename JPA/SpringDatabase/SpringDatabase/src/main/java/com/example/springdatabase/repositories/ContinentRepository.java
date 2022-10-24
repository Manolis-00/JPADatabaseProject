package com.example.springdatabase.repositories;

import com.example.springdatabase.models.Continent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends CrudRepository<Continent, Integer> {
    public Continent findContinentsByContinent_id(int continent_id);
    public Continent findContinentsByName(String name);
}
