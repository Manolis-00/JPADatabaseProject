package com.example.springdatabase.services;

import com.example.springdatabase.models.RegionArea;
import com.example.springdatabase.repositories.RegionAreaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RegionAreaService {
    private final RegionAreaRepository regionAreaRepository;

    public RegionAreaService(RegionAreaRepository regionAreaRepository) {
        this.regionAreaRepository = regionAreaRepository;
    }

    public RegionArea findRegionAreasByID(int id) {
        return regionAreaRepository.findRegionAreasByID(id);
    }

    public List<RegionArea> findRegionAreasByRegion_name(String region_name) {
        return regionAreaRepository.findRegionAreasByRegion_name(region_name);
    }

    public List<RegionArea> findRegionAreasByRegion_area(BigDecimal region_area) {
        return regionAreaRepository.findRegionAreasByRegion_area(region_area);
    }
}
