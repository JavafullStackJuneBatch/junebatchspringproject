package com.example.junebatchspringproject.repository;


import com.example.junebatchspringproject.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Students,Long>  {

    List<Students> findByName(String name);
}
//entity class and primary key datatype <Students, long>