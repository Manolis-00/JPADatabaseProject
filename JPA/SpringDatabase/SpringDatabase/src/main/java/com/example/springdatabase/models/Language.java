package com.example.springdatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue
    private Integer language_id;
    private String language;

    public Language() { }

    public Language(String language) {
        this.language = language;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Language{" +
                "language_id=" + language_id +
                ", language='" + language + '\'' +
                '}';
    }
}
