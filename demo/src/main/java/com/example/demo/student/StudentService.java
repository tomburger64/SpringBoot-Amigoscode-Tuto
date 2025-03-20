package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// @service / @component makes the object a 'bean', means Spring creates / manages it
// @Service = @Component, component "by default" but here write "service" cuz it's a service api layer (basically semantic / readability)
@Service
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
