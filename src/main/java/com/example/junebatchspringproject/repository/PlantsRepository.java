package com.example.junebatchspringproject.repository;

import com.example.junebatchspringproject.entity.Plants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantsRepository extends JpaRepository <Plants,Long>{

    List<Plants> findByName(String name);
}
