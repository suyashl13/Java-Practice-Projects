package com.hiresuyash.spring_data_jpa_example.service;

import com.hiresuyash.spring_data_jpa_example.model.Student;
import com.hiresuyash.spring_data_jpa_example.repository.StudentRepository;
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
