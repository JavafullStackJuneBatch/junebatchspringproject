package com.example.junebatchspringproject.repository;

import com.example.junebatchspringproject.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User1Repository extends JpaRepository<User1,Long> {
}
