package com.example.springdatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "region_area")
public class RegionArea {

    @Id
    @GeneratedValue
    private String region_name;
    private BigDecimal region_area;

    public RegionArea() { }

    public RegionArea(BigDecimal region_area) {
        this.region_area = region_area;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public BigDecimal getRegion_area() {
        return region_area;
    }

    public void setRegion_area(BigDecimal region_area) {
        this.region_area = region_area;
    }

    @Override
    public String toString() {
        return "RegionArea{" +
                "region_name='" + region_name + '\'' +
                ", region_area=" + region_area +
                '}';
    }
}
