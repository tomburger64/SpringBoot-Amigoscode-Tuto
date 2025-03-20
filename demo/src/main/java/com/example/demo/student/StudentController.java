package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // instance and constructor here to receive data from StudentService
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET http request
    // can take a parameter to show the data at the url+paramater url page
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudents();
    }
}
