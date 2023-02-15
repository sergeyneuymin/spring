package org.sergeyneuymin.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {

    //@Autowired
    private Pet pet;
    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    //public Person() {}

    //@Autowired
    //public Person(@Qualifier("dog") Pet pet) {
    //    this.pet = pet;
    //    System.out.println("dog bean is created");
    //}

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("dog bean is created");
    }

    //@Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println(surname);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(age);
    }

    public void callYourPet() {
        System.out.println("Hello, my pet");
        pet.say();
        System.out.println(getAge());
        System.out.println(age);
    }
}
