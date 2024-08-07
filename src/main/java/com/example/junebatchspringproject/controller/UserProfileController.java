package com.example.junebatchspringproject.controller;

import com.example.junebatchspringproject.entity.UserProfile;
import com.example.junebatchspringproject.services.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/userprofile")
public class UserProfileController {
    @Autowired
    UserProfileService userProfileService;
    @PostMapping("/createUserProfile")
    public UserProfile createUserProfile(@RequestBody UserProfile userProfile){
        return userProfileService.createUserProfile(userProfile);
    }

}
