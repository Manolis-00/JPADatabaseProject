package com.example.springdatabase.controllers;

import com.example.springdatabase.models.RegionArea;
import com.example.springdatabase.services.RegionAreaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class RegionAreaController {
    private final RegionAreaService regionAreaService;

    public RegionAreaController(RegionAreaService regionAreaService) {
        this.regionAreaService = regionAreaService;
    }

    @GetMapping(path = "/RegionAreas/{id}")
    public RegionArea findRegionAreasByID(@PathVariable ("id") int id) {
        return regionAreaService.findRegionAreasByID(id);
    }

    @GetMapping(path = "/RegionAreas/{region_name}")
    public List<RegionArea> findRegionAreasByRegion_name(@PathVariable ("region_name") String region_name) {
        return regionAreaService.findRegionAreasByRegion_name(region_name);
    }

    @GetMapping(path = "/RegionAreas/{region_area}")
    public List<RegionArea> findRegionAreasByRegion_area(@PathVariable ("region_area")BigDecimal region_area) {
        return regionAreaService.findRegionAreasByRegion_area(region_area);
    }
}
