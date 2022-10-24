package com.example.springdatabase.controllers;

import com.example.springdatabase.models.Continent;
import com.example.springdatabase.services.ContinentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContinentController {
    private ContinentService continentService;

    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping(path = "/Continents/{continent_id}")
    public Continent getContinentByID(@PathVariable ("continent_id") Integer continent_id) {
        return continentService.getContinentByContinentID(continent_id);
    }

    @GetMapping(path = "/Continents/{name}")
    public Continent getContinentByName(@PathVariable ("name") String name) {
        return continentService.getContinentByName(name);
    }
}
