package org.sergeyneuymin.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = context.getBean("myPerson",Person.class);
        person.callYourPet();

        context.close();
    }
}
