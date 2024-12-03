package com.cohort_16.demo_application.services;

import com.cohort_16.demo_application.models.Student;
import com.cohort_16.demo_application.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

    //Business logic -

    @Autowired
    StudentRepository studentRepository;

    public Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    //Edit a student
    public void updateStudent(Long id, Student student){

        //loop through the list of students
//        for(int x = 0; x < students.size(); x++){
//            Student s = students.get(x);
//            if(s.getId().equals(id)){
//                students.set(x, student);
//            }
//        }
        // if the id of the student matches the student
        //update the student

    }


}
