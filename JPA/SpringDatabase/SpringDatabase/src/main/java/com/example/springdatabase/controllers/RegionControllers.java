package com.example.springdatabase.controllers;

import com.example.springdatabase.models.Region;
import com.example.springdatabase.services.RegionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class RegionControllers {
    private RegionService regionService;

    public RegionControllers(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping(path = "/Regions/{continent_id}")
    public Region getContinentId(@PathVariable("continent_id") int continent_id) {
        return regionService.getContinentId(continent_id);
    }

    @GetMapping(path = "/Regions/{region_id")
    public Region findRegionsByRegion_id(@PathVariable ("region_id") Integer region_id) {
        return regionService.findRegionsByRegion_id(region_id);
    }

    @GetMapping(path = "/Regions/{name}")
    public Region findRegionsByName(@PathVariable ("name") String name) {
        return regionService.findRegionsByName(name);
    }
}
