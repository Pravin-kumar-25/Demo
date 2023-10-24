package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    public StudentService() {
    }

    public List<Student> getStudentList() {
        return List.of(
          new Student(1,"Pravin","pravinkumar",23),
          new Student(2,"Kavin", "kavin@gmail", 16)
        );
    }
}
