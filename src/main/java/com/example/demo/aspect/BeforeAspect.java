package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.annotation.Aspect;


@Aspect //the combination of pointcut and advice is called Aspect
@Configuration
public class BeforeAspect {

    private static Logger logger = LoggerFactory.getLogger(BeforeAspect.class);

    //What kind of method calls I would intercept
    //define point cut here
    //execution(* PACKAGE.*.*(..)) -> first * means any return type
//    @Before("com.example.demo.service.Business1.calculateSomething()")
    //(Weaving and Weaver) a framework which implements it called weaver, the process of doing that is called viewing
    @Before("execution(* com.example.demo.service.Business1.*(..))") //this will intercept only Business1, pointcut is expression which define for Business1
    public void before(JoinPoint joinPoint){ //get details use JoinPoint, it is specific interception of a method call, specific execution instance.
        logger.info(" Intercepted Method Calls - {}", joinPoint ); //this is called an advice, what should i do when i do the interception
    }
}
