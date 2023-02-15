package org.sergeyneuymin.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        //Pet cat = context.getBean("catBean",Cat.class);
        //cat.say();

        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
        context.close();
    }

}
