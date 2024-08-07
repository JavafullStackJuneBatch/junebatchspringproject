package com.example.junebatchspringproject.services;

import com.example.junebatchspringproject.entity.Country1;
import com.example.junebatchspringproject.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public Country1 createCountry1(Country1 country1) {
        return countryRepository.save(country1);
    }
}
