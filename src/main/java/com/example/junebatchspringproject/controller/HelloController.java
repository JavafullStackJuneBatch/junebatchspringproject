package com.example.junebatchspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("My first endpoint");
<<<<<<< HEAD
=======
        System.out.println("Chk");
        System.out.println("Hello ambika");
>>>>>>> 1ed1b4e29846c4cdaf4f5ad895f330fe54d0a902

        System.out.println("Hello Suryasree");
       System.out.println("Hello swathi");
        System.out.println("Hello parvathy");
        System.out.println("Hello bhavana");
        System.out.println("Hello Worldg");
        System.out.println("Hello Akshatha");
        System.out.println("june batch");
        System.out.println("JavaFullStack");
        System.out.println("Hello Everyone");

        System.out.println("New Branch");

        System.out.println("Surachita");
        System.out.println("Hello World");
        System.out.println("Branch added");




=======
        System.out.println("Hello ambika");
>>>>>>> 61a509198006de23218b25afef0eb31d44297881
        return "Hellow World Saritha";
    }


    @GetMapping("/helloSaritha")
    public String sayHello1(){
<<<<<<< HEAD
        System.out.println("creating  branch");
        return "Hellow World Saritha ---------=======";
=======
        System.out.println("creating branch");
        System.out.println("added Bhavana_ Branch");
        return "Hellow World Saritha";
>>>>>>> 1ed1b4e29846c4cdaf4f5ad895f330fe54d0a902

    }


}
