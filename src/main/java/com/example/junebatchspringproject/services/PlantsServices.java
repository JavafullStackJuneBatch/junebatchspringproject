package com.example.junebatchspringproject.services;

import com.example.junebatchspringproject.entity.Plants;

import com.example.junebatchspringproject.repository.PlantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlantsServices {
    @Autowired
    private PlantsRepository plantsRepository;

    public Plants addPlants(Plants plants){
        plantsRepository.save(plants);
        return plants;

    }

    public  List<Plants> getByName(String name) {
        return plantsRepository.findByName(name);
    }


}
