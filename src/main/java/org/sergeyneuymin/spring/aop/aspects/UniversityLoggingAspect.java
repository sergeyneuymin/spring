package org.sergeyneuymin.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice() : Logging getting list of students by method getStudents()");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//
//        students.get(0).setNameSurname("Mister");
//        System.out.println("First student = " + students.get(0).getNameSurname());
//        System.out.println("afterReturningGetStudentsLoggingAdvice() : Logging getting list of students after completing method getStudents()");
//    }
//
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice() : Logging exception of method getStudents() " + exception.getMessage());
//    }

//    @After("execution(* getStudents(..))")
//    public void afterGetStudentsLoggingAdvice() {
//        System.out.println("afterGetStudentsLoggingAdvice() : Logging normal completion or throwing an exception of method getStudents() ");
//    }
}
