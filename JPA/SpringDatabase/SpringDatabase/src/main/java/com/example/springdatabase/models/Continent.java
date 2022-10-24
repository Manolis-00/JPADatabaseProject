package com.example.springdatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "continents")
public class Continent {
    @Id
    @GeneratedValue
    private int continent_id;
    private String name;

    public Continent() {
        
    }

    public Continent(String name) {
        this.name = name;
    }

    public void setContinent_id(int id) {
        this.continent_id = id;
    }

    public int getContinent_id() {
        return continent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent_id=" + continent_id +
                ", name='" + name + '\'' +
                '}';
    }
}
