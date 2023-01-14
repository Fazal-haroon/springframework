package com.example.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.example.demo.service..*(..))")
    public void dataLayerExecution(){}
    @Pointcut("execution(* com.example.demo.service.Business1.*(..))")
    public void business1LayerExecution(){}
}
