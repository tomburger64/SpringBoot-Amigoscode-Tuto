package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    // method that returns a list of student objs
    public List<Student> getStudents() {
        // returns a list made of...
        return List.of(
                // ... a new student obj (hardcoded)
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }
}
