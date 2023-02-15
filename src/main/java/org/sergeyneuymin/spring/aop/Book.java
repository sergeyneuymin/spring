package org.sergeyneuymin.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Crime and law")
    private String name;

    @Value("Dostoevsky")
    private String author;

    @Value("1866")
    private String yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }
}
