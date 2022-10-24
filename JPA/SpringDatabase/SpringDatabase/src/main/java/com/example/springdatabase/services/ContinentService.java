package com.example.springdatabase.services;

import com.example.springdatabase.models.Continent;
import com.example.springdatabase.repositories.ContinentRepository;
import org.springframework.stereotype.Service;

@Service
public class ContinentService {
    private final ContinentRepository continentRepository;

    public ContinentService(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    public Continent getContinentByContinentID(Integer continent_id) {
        return continentRepository.findContinentsByContinent_id(continent_id);
    }

    public Continent getContinentByName(String name) {
        return continentRepository.findContinentsByName(name);
    }
}
