package com.fortis.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by ft on 2018/1/16.
 */
@Aspect
//@Component
public class ActionAspect {

    @Pointcut("@annotation(com.fortis.demo.CheckAction)")
    public void anyMethod(){}

    @Around("anyMethod()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("===环绕通知开始===");
        Object obj = null;
        obj = joinPoint.proceed();
        System.out.println("===环绕通知结束===");
        return obj;
    }
}
