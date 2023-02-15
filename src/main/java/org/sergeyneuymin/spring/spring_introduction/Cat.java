package org.sergeyneuymin.spring.spring_introduction;

//@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
