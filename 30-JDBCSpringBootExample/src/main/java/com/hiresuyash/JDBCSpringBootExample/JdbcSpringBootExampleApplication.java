package com.hiresuyash.JDBCSpringBootExample;

import com.hiresuyash.JDBCSpringBootExample.model.Student;
import com.hiresuyash.JDBCSpringBootExample.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class JdbcSpringBootExampleApplication {

	public static void main(String[] args) {
		final ApplicationContext context = SpringApplication.run(JdbcSpringBootExampleApplication.class, args);
		StudentService studentService = context.getBean(StudentService.class);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("------------ Students ------------\n");
			System.out.println("1. ) Add Student.");
			System.out.println("2. ) List Students.\n");

			System.out.print("Choice: ");
			String choice = scanner.next();

			switch (choice){
				case "1":
					Student student = context.getBean(Student.class);
					System.out.println("------------ Adding new Student ------------\n");
					System.out.print("Name: ");
					student.setName(scanner.next());
					System.out.print("Marks: ");
					student.setMarks(Integer.parseInt(scanner.next()));

					studentService.addStudent(student);
					System.out.println("\n" + student.getName() + " was added to database.\n");
					break;
				case "2":
					System.out.println("------------ Students ------------\n");
					List<Student> studentList = studentService.getStudents();

					System.out.println("Roll. no.\t\tName\t\tMarks");
					for (Student s: studentList) {
						System.out.println(s.getRollNo() + "\t\t\t" + s.getName()  + "\t\t\t" + s.getMarks());
					}

					break;
				default:
					scanner.close();
					return;
			}

		}
	}

}
