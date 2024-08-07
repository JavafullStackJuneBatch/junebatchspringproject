package com.example.junebatchspringproject.repository;

import com.example.junebatchspringproject.entity.Country1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country1,Long> {
}
