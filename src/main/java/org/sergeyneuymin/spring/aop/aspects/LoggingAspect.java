package org.sergeyneuymin.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.sergeyneuymin.spring.aop.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* org.sergeyneuymin.spring.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() { }
//
//    @Pointcut("execution(public void org.sergeyneuymin.spring.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() { }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() { }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log#10");
//    }

//    @Pointcut("execution(* org.sergeyneuymin.spring.aop.UniLibrary.get*()))")
//    private void allGetMethodsFromUniLibrary() { }
//
//    @Pointcut("execution(* org.sergeyneuymin.spring.aop.UniLibrary.return*()))")
//    private void allReturnMethodsFromUniLibrary() { }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() { }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log#3");
//    }




    //@Before("execution(public void org.sergeyneuymin.spring.aop.UniLibrary.getBook())")
    //любое кол-во любых параметров в любом методе, кот. нач. на get
    //@Before("execution(public void org.sergeyneuymin.spring.aop.UniLibrary.get*(..))")
    @Before("org.sergeyneuymin.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("method signature = "+methodSignature);
        System.out.println("method signature.getMethod() = "+methodSignature.getMethod());
        System.out.println("method signature.getReturnType() = "+methodSignature.getReturnType());
        System.out.println("method signature.getName() = "+methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {

            Object args[] =joinPoint.getArgs();

            for (Object o : args) {
                if(o instanceof Book) {
                    Book myBook = (Book) o;
                    System.out.println("info: " + myBook.getName()+", "+ myBook.getAuthor() + ", " + myBook.getYearOfPublication());
                } else if(o instanceof String) {
                    System.out.println("Adding book by " + o);
                }
            }

        }
        System.out.println("beforeGetLoggingAdvice: trying to get...");
        System.out.println("-------------------------------");
    }

//    @Before("execution(* org.sergeyneuymin.spring.aop.UniLibrary.return*())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: trying to return book...");
//        System.out.println("-------------------------------");
//    }

}
