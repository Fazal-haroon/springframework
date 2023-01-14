package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.example.demo.service..*(..))")
    public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable { //point would allow you to continue with execution of method
        //startTime = x
        long startTime = System.currentTimeMillis();
        //allow execution of method
        joinPoint.proceed();
        //endTime = y
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
    }
}
