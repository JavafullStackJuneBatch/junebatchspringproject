package com.example.junebatchspringproject.controller;

import com.example.junebatchspringproject.entity.Students;
import com.example.junebatchspringproject.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/students") //api can be any name
@RestController
public class StudentController {
    @Autowired
    private StudentServices studentServices;
    @PostMapping("/createStudent")
    public Students createStudent(@RequestBody Students student){
        studentServices.createStudent(student);

        return student;

    }
    @GetMapping("/all")
    public List<Students> getAllStudents(){
       return studentServices.getAllStudents();
    }
    @GetMapping("/{id}")   //you have to put in {} and {id this value is same as Long Id}

    public Students getStudentID(@PathVariable Long id){
       return studentServices.getStudentId(id);

    }
    @PutMapping("/updateStudent/{id}")
    public Students updateStudent(@RequestBody Students students, @PathVariable Long id){
        return studentServices.updateStudent(students,id);

    }

    @DeleteMapping("{id}")
    public String deleteStudentId(@PathVariable long id){
        return studentServices.deleteStudentId(id);
    }
    @GetMapping("/name/{name}")
    public List<Students> getStudentByName(@PathVariable String name){
        return studentServices.getStudentByName(name);
    }


}

