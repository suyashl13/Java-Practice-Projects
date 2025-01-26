package com.telusko.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.telusko.springbootrest.model.JobPost;
import com.telusko.springbootrest.service.JobService;

@RestController	
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	
	@GetMapping("jobPosts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
		
	}

	@GetMapping("jobPost/{jobId}")
	public JobPost getJob(@PathVariable("jobId") Integer jobId) {
		return service.getJob(jobId);
	}

	@PostMapping("jobPost")
	public JobPost createJobPost(@RequestBody JobPost jobPost) {
		service.create(jobPost);
		return service.getJob(jobPost.getPostId());
	}

	@PutMapping("jobPost/{jobId}")
	public JobPost updateJobPost(@RequestBody JobPost jobPost) {
		return service.updateJobPost(jobPost);
	}

}
