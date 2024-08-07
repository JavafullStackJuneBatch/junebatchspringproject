package com.example.junebatchspringproject.repository;

import com.example.junebatchspringproject.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
