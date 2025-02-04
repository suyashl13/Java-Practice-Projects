package com.telusko.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

	public static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);


	// return <type  class name.method name(args)>
	@Before("execution(* com.telusko.springbootrest.service.JobService.*(..))")
	public void logMethodCall(JoinPoint joinPoint) {
		LOGGER.info("Method Called Before " + joinPoint.getSignature());
	}

	@After("execution(* com.telusko.springbootrest.service.JobService.*(..))")
	public void logMethodCallAfter(JoinPoint joinPoint) {
		LOGGER.info("Method Called After " + joinPoint.getSignature());
	}

	@Around("execution(* com.telusko.springbootrest.service.JobService.*(..))")
	public Object measurePerformance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		long startTime = System.currentTimeMillis();

		Object obj = proceedingJoinPoint.proceed();

		long endTime = System.currentTimeMillis();

		System.out.println("Required Time: " + (endTime - startTime) + "ms");


		return obj;
	}

	@Around("execution(* com.telusko.springbootrest.service.JobService.getJob(..)) && args(jobId)")
	public Object validateAndUpdate(ProceedingJoinPoint jp, int jobId) throws Throwable {
		if (jobId < 1){
			LOGGER.info("PostId is negative updating it");
			jobId = -jobId;
			LOGGER.info("Updated to : " + jobId);
		}

		Object object = jp.proceed(new Object[] {jobId});

		return object;
	}

}
