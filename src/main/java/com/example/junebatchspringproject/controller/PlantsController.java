package com.example.junebatchspringproject.controller;

import com.example.junebatchspringproject.entity.Plants;
import com.example.junebatchspringproject.repository.PlantsRepository;
import com.example.junebatchspringproject.services.PlantsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.Name;
import java.util.List;

@RequestMapping("/api/plants")
@RestController
public class PlantsController {
    @Autowired
    private PlantsServices plantsServices;
    @PostMapping("/addPlants")
    public Plants addPlants(@RequestBody Plants plant){
        plantsServices.addPlants(plant);
        return plant;
    }
    @GetMapping("/name/{name}")
    public List<Plants> getByName(@PathVariable String name){
        return plantsServices.getByName(name);
    }
}
