package com.example.springdatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guests")
public class Guest {
    @Id
    @GeneratedValue
    private Integer guest_id;
    private String name;

    public Guest() { }

    public Guest(String name) {
        this.name = name;
    }

    public void setGuest_id(Integer guest_id) {
        this.guest_id = guest_id;
    }

    public Integer getGuest_id() {
        return guest_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guest_id=" + guest_id +
                ", name='" + name + '\'' +
                '}';
    }
}
