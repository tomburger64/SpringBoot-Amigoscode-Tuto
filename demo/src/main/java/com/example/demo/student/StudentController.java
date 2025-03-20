package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // instance used to get the object in this class
    private final StudentService studentService;

    // @Autowired means Spring "injects" the object automatically, here in the constructor
    // spring creates the object automatically (no writing 'new StudentService' here
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



    // GET http request
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudents();
    }
}
