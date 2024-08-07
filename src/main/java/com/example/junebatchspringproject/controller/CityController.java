package com.example.junebatchspringproject.controller;

import com.example.junebatchspringproject.entity.City1;
import com.example.junebatchspringproject.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/city1")
public class CityController {
    @Autowired
    CityService cityService;
    @PostMapping("/createCity1")
    public City1 createCity1(@RequestBody City1 city1){
       return cityService.createCity1(city1);
    }

}
