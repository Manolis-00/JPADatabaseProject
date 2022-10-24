package com.example.springdatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vips")
public class Vip {
    @Id
    @GeneratedValue
    private Integer vip_id;
    private String name;

    public Vip() { }

    public Vip(String name) {
        this.name = name;
    }

    public void setVip_id(Integer vip_id) {
        this.vip_id = vip_id;
    }

    public Integer getVip_id() {
        return vip_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "vip_id=" + vip_id +
                ", name='" + name + '\'' +
                '}';
    }
}
