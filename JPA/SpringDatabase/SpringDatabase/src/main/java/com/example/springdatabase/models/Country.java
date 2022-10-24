package com.example.springdatabase.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue
    private int country_id;
    private String name;
    private float area;
    private Date national_day;
    private String country_code2;
    private String country_code3;
    @ManyToOne
    private Region region;

    public void setCountry_id(int id) {
        this.country_id = id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Date getNational_day() {
        return national_day;
    }

    public void setNational_day(Date national_day) {
        this.national_day = national_day;
    }

    public String getCountry_code2() {
        return country_code2;
    }

    public void setCountry_code2(String country_code2) {
        this.country_code2 = country_code2;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
    }

    public int getRegion_id() {
        return region.getRegion_id();
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", national_day=" + national_day +
                ", country_code2='" + country_code2 + '\'' +
                ", country_code3='" + country_code3 + '\'' +
                ", region_id=" + region.getRegion_id() +
                '}';
    }
}
