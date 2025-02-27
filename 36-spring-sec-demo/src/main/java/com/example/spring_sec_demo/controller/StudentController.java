package com.example.spring_sec_demo.controller;

import com.example.spring_sec_demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    public static final List<Student> studentList = new ArrayList<>(List.of(
            new Student(1, "Suyash", "Java"),
            new Student(2, "Parulkar", "Python"),
            new Student(2, "Yashwant", "Python")
    ));

    @GetMapping
    public ResponseEntity<?> getStudents() {
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @GetMapping("csrf-token")
    public ResponseEntity<?> getCSRFToken(HttpServletRequest request) {
        return new ResponseEntity<>(request.getAttribute("_csrf"), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        studentList.add(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
