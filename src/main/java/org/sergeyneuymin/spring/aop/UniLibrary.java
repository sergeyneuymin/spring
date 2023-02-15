package org.sergeyneuymin.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We took a book from Unilibarary ");
        System.out.println("-------------------------------");
    }

    public void getMagazine() {
        System.out.println("We took a magazine from Unilibarary");
        System.out.println("-------------------------------");

    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("we are returning book from Unilibrary");
//        System.out.println("-------------------------------");
        return "War and Peace";
    }

    public void returnMagazine() {
        System.out.println("we are returning magazine from Unilibrary");
        System.out.println("-------------------------------");

    }

    public void addBook(String personName, Book book) {
        System.out.println("we are adding book to Unilibrary");
        System.out.println("-------------------------------");

    }

    public void addMagazine() {
        System.out.println("we are adding magazine to Unilibrary");
        System.out.println("-------------------------------");

    }


}
