package com.example.filter.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimerAop {

    @Pointcut(value = "within(com.example.filter.controller.UserApiController)")
    public void timePointCut(){

    }

    @Around(value = "timePointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("메소드 실행 이전");
        joinPoint.proceed();
        System.out.println("메소드 실행 이후");
    }
}
