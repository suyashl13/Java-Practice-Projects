package com.example.spring_data_rest_demo.repository;

import com.example.spring_data_rest_demo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobPost, Integer> {

}
