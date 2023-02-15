package org.sergeyneuymin.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    void getBook() {
        System.out.println("We took a book from Schoollibarary");;
    }
}
