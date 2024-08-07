package com.example.junebatchspringproject.services;

import com.example.junebatchspringproject.entity.City1;
import com.example.junebatchspringproject.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public City1 createCity1(City1 city1) {
        return cityRepository.save(city1);
    }
}
