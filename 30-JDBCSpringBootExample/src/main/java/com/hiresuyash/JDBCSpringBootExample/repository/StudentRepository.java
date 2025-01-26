package com.hiresuyash.JDBCSpringBootExample.repository;

import com.hiresuyash.JDBCSpringBootExample.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String insertStudentSqlQuery = "insert into student (name, marks) values (?, ?);";
        int rows = jdbc.update(insertStudentSqlQuery, student.getName(), student.getMarks());

        System.out.println("Rows Affected: " + rows);
    }

    public List<Student> findAll() {
        String findAllSqlQuery = "select rollno, name, marks from student;";
        RowMapper<Student> mapper =  (rs, rowNumber) -> {
            Student student = new Student();

            student.setName(rs.getString("name"));
            student.setRollNo(rs.getInt("rollno"));
            student.setMarks(rs.getInt("marks"));

            return student;
        };

        return jdbc.query(findAllSqlQuery, mapper);
    }
}
