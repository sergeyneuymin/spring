package org.sergeyneuymin.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice(): trying to return book to the library");
        long begin = System.currentTimeMillis();

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice(): Exception caught " + e);
            //targetMethodResult = "War and law";
            throw e;
        }
        targetMethodResult = "Crime and law";
        long end = System.currentTimeMillis();
        long time = end - begin;
        System.out.println("aroundReturnBookLoggingAdvice(): successful returned book to the library in time " + time + " ms");
        return targetMethodResult;
    }

}
