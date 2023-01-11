package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.annotation.Aspect;


@Aspect
@Configuration
public class BeforeAspect {

    private static Logger logger = LoggerFactory.getLogger(BeforeAspect.class);

    //What kind of method calls I would intercept
    //define point cut here
    //execution(* PACKAGE.*.*(..)) -> first * means any return type
//    @Before("com.example.demo.service.Business1.calculateSomething()")
    @Before("execution(* com.example.demo.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        //get details use JoinPoint
        logger.info(" Intercepted Method Calls - {}", joinPoint );
    }
}
