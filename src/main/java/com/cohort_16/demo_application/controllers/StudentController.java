package com.cohort_16.demo_application.controllers;

import com.cohort_16.demo_application.models.Student;
import com.cohort_16.demo_application.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {


    @Autowired
    StudentService studentService; // dependency Injection

    //Format JSON - Javascript object notation

    @RequestMapping("/students")
    public Iterable<Student> getListOfStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public void createStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public void editStudent(@PathVariable Long id, @RequestBody Student student ){
        studentService.updateStudent(id, student);
    }






}