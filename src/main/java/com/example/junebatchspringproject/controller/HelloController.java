package com.example.junebatchspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("My first endpoint");
        System.out.println("Hello Suryasree");

        System.out.println("Hello bhavana");
        System.out.println("Hello Everyone");
        System.out.println("Surachita");
        return "Hellow World Saritha";
    }


    @GetMapping("/helloSaritha")
    public String sayHello1(){
        return "Hellow World Saritha ---------=======";
    }


}
