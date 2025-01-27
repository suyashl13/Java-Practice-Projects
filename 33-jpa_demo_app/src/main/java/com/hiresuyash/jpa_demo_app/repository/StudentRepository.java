package com.hiresuyash.jpa_demo_app.repository;

import com.hiresuyash.jpa_demo_app.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer> {

    List<Student> findByStudentClass(int studentClass);

}
