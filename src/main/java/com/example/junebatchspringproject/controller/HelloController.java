package com.example.junebatchspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("My first endpoint");
        System.out.println("Chk");
        System.out.println("Hello ambika");

        System.out.println("Hello Suryasree");
       System.out.println("Hello swathi");
        System.out.println("Hello parvathy");
        System.out.println("Hello bhavana");
        System.out.println("Hello Worldg");
        System.out.println("Hello Akshatha");
<<<<<<< HEAD
<<<<<<< HEAD
        System.out.println("june batch");
        System.out.println("JavaFullStack");
        System.out.println("SpringBootProject");
        System.out.println("Github");
=======

        System.out.println("june batch");
        System.out.println("JavaFullStack");
        System.out.println("SpringBootProject");
>>>>>>> a757969d188c7f6e9f74b9f4ee0c1fdd37ee340f

        System.out.println("Hello Everyone");

        System.out.println("New Branch");

        System.out.println("Surachita");
        System.out.println("Hello World");
        System.out.println("Branch added");




        return "Hellow World Saritha";
    }


    @GetMapping("/helloSaritha")
    public String sayHello1(){
        System.out.println("creating branch");
        System.out.println("Bhavana1836 Branch");
        return "Hello World Saritha";

    }


}
