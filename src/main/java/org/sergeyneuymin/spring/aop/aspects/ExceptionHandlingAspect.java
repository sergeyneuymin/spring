package org.sergeyneuymin.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("org.sergeyneuymin.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: trying to handle an exception...");
        System.out.println("-------------------------------");
    }

}
