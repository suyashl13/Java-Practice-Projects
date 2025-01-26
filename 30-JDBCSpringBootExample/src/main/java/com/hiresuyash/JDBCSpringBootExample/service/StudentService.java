package com.hiresuyash.JDBCSpringBootExample.service;

import com.hiresuyash.JDBCSpringBootExample.model.Student;
import com.hiresuyash.JDBCSpringBootExample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        this.studentRepository.save(student);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

}
