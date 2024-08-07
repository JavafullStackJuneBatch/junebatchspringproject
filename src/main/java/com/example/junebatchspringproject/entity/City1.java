package com.example.junebatchspringproject.entity;

import jakarta.persistence.*;

@Entity
public class City1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cityName;
    private String postcode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Country1 country1;
//
//    public Country1 getCountry1() {
//        return country1;
//    }
//
//    public void setCountry1(Country1 country1) {
//        this.country1 = country1;
//    }
}
