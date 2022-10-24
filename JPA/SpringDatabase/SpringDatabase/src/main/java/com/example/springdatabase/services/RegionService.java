package com.example.springdatabase.services;

import com.example.springdatabase.models.Region;
import com.example.springdatabase.repositories.RegionRepository;
import org.springframework.stereotype.Service;

@Service
public class RegionService {
    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public Region getContinentId(int continent_id) {
        return regionRepository.findRegionByContinent_id(continent_id);
    }

    public Region findRegionsByRegion_id(Integer region_id) {
        return regionRepository.findRegionsByRegion_id(region_id);
    }

    public Region findRegionsByName(String name) {
        return regionRepository.findRegionsByName(name);
    }
}
