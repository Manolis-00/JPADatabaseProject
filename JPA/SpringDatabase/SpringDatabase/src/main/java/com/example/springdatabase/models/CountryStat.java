package com.example.springdatabase.models;

import javax.persistence.*;

@Entity
@Table(name = "country_stats")
public class CountryStat {
    @Id
    private Integer year;
    private int population;
    private long gdp;
    @ManyToOne
    Country country;

    public CountryStat() {}

    public CountryStat(int year, int population, long gdp) {
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public long getGdp() {
        return gdp;
    }

    public void setGdp(long gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "CountryStat{" +
                "Country: " + country.getCountry_id() +
                "year=" + year +
                ", population=" + population +
                ", gdp=" + gdp +
                '}';
    }
}
