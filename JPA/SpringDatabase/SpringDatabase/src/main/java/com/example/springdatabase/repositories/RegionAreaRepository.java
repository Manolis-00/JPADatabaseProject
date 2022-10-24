package com.example.springdatabase.repositories;

import com.example.springdatabase.models.RegionArea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface RegionAreaRepository extends CrudRepository<RegionArea, String> {
    public RegionArea findRegionAreasByID(int ID);
    public List<RegionArea> findRegionAreasByRegion_name(String region_name);
    public List<RegionArea> findRegionAreasByRegion_area(BigDecimal region_area);
}
