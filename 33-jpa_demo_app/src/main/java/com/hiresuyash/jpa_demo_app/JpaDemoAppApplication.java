package com.hiresuyash.jpa_demo_app;

import com.hiresuyash.jpa_demo_app.models.Student;
import com.hiresuyash.jpa_demo_app.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JpaDemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaDemoAppApplication.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		List<Student> students = studentRepository.findByStudentClass(12);

		for (Student student: students) {
			System.out.println(student.getStudentName());
		}

	}
}
