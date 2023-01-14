package com.example.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.example.demo.service..*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.example.demo.service.Business1.*(..))")
    public void business1LayerExecution() {
    }

    @Pointcut("com.example.demo.aspect.CommonJoinPointConfig.dataLayerExecution() && com.example.demo.aspect.CommonJoinPointConfig.business1LayerExecution()")
    public void allLayerExecution() {
    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {
    }

    @Pointcut("within(com.example.demo.service..*")
    public void dataLayerExecutionWithWithin(){}
}
