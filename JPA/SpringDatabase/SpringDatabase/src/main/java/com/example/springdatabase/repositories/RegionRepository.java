package com.example.springdatabase.repositories;

import com.example.springdatabase.models.Region;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository<Region, Integer> {

    @Query("select a from Continent a where a.continent_id = ?1")
    public Region findRegionByContinent_id(int continent_id);
    public Region findRegionsByRegion_id(Integer region_id);
    public Region findRegionsByName(String name);
}
