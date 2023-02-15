package org.sergeyneuymin.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Method main started");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();

        System.out.println("Returned book " + bookName);
        System.out.println();

        context.close();
        System.out.println("Method main ended");
    }

}
