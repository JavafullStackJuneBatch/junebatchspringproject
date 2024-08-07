package com.example.junebatchspringproject.services;

import com.example.junebatchspringproject.entity.UserProfile;
import com.example.junebatchspringproject.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
    @Autowired
    UserProfileRepository userProfileRepository;

    public UserProfile createUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }
}
