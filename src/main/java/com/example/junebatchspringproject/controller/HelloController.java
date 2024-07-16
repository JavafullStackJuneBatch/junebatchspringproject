package com.example.junebatchspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("My first endpoint");

        System.out.println("Hello Suryasree");
       System.out.println("Hello swathi");
        System.out.println("Hello parvathy");
        System.out.println("Hello bhavana");
        System.out.println("Hello Worldg");
        System.out.println("Hello Akshatha");
        System.out.println("june batch");
        System.out.println("Hello Everyone");
        System.out.println("Surachita");
        System.out.println("Hello World");


=======
        System.out.println("Hello ambika");
>>>>>>> 61a509198006de23218b25afef0eb31d44297881
        return "Hellow World Saritha";
    }


    @GetMapping("/helloSaritha")
    public String sayHello1(){
        System.out.println("creating  branch");
        return "Hellow World Saritha ---------=======";

    }


}
