package com.example.springdatabase.models;

import javax.persistence.*;

@Entity
@Table(name = "country_languages")
public class CountryLanguage {
    @Id
    @ManyToOne
    Language language;
    @ManyToOne
    Country country;
    private int official;

    public CountryLanguage() {}

    public CountryLanguage(int official) {
        this.official = official;
    }

    public int getOfficial() {
        return official;
    }

    public void setOfficial(int official) {
        this.official = official;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" + language.getLanguage_id() +
                "Country: " + country.getCountry_id() +
                ", official=" + official +
                '}';
    }
}
