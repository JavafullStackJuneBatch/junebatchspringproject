package com.example.junebatchspringproject.services;

import com.example.junebatchspringproject.entity.Students;
import com.example.junebatchspringproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired    //dependency injection
    private StudentRepository studentRepository;



    public Students createStudent(Students student){
        studentRepository.save(student);
        return student;

    }

    public List<Students> getAllStudents() {

      return   studentRepository.findAll();

    }

    public Students getStudentId(Long id) {
        return studentRepository.findById(id).get();
    }

    public Students updateStudent(Students students, Long id) {
       Students exisistingStudent= studentRepository.findById(id).get();
        if(exisistingStudent != null){
            exisistingStudent.setName(students.getName());
            exisistingStudent.setEmail(students.getEmail());
            exisistingStudent.setCourse(students.getCourse());
            studentRepository.save(exisistingStudent);

           // return exisistingStudent;

        }
       return null;
    }

    public String deleteStudentId(Long id) {

            studentRepository.deleteById(id);
            return  "Student deleted sucessfully";
    }

   public  List<Students> getStudentByName(String name) {
      return studentRepository.findByName(name);
    }
}
