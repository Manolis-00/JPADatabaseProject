package com.example.springdatabase.models;

import javax.persistence.*;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue
    private Integer region_id;
    private String name;
    @ManyToOne
    Continent continent;

    public Region() { }

    public Region(String name) {
        this.name = name;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "region_id=" + region_id +
                ", name='" + name + '\'' +
                ", continent=" + continent.getContinent_id() +
                '}';
    }
}
