package com.example.junebatchspringproject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Country1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String capital;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    @OneToMany(mappedBy = "city")
    private List<City1> citis;

    public List<City1> getCitis() {
        return citis;
    }

    public void setCitis(List<City1> citis) {
        this.citis = citis;
    }
}
