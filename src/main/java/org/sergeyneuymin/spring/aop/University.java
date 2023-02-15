package org.sergeyneuymin.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {

        Student s1 = new Student("Ivan1", 18, 4.1);
        Student s2 = new Student("Ivan2", 19, 4.2);
        Student s3 = new Student("Ivan3", 20, 4.3);

        students.add(s1);
        students.add(s2);
        students.add(s3);
    }

    public List<Student> getStudents() {
        System.out.println("Starting method getStudents()...");

        //throws exception
        System.out.println(students.get(3));

        System.out.println("Info from method getStudents: ");
        System.out.println(students);
        return students;
    }

}
