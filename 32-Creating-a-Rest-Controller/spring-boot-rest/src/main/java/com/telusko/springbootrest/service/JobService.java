package com.telusko.springbootrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springbootrest.model.JobPost;
import com.telusko.springbootrest.repo.JobRepo;


@Service
public class JobService {
	@Autowired
	public JobRepo repo;

	public List<JobPost> getAllJobs() {
		return repo.getAllJobs();
	}

	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	}

    public JobPost getJob(Integer jobId) {
		return repo.getJob(jobId);
    }

	public void create(JobPost jobPost) {
        repo.create(jobPost);
    }

	public JobPost updateJobPost(JobPost jobPost) {
		return repo.updateJobPost(jobPost);
	}
}
