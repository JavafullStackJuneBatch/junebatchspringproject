package com.example.junebatchspringproject.controller;

import com.example.junebatchspringproject.entity.Country1;
import com.example.junebatchspringproject.repository.CountryRepository;
import com.example.junebatchspringproject.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/country1")
public class CountryController {
    @Autowired
    CountryService countryService;
    @PostMapping("/createCountry")
    public Country1 createCountry1(@RequestBody Country1 country1){
        return countryService.createCountry1(country1);
    }
}
