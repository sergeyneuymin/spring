package org.sergeyneuymin.spring.aop;

public class Student {

    private String nameSurname;
    private int age;
    private double aggGrade;

    public Student(String nameSurname, int age, double aggGrade) {
        this.nameSurname = nameSurname;
        this.age = age;
        this.aggGrade = aggGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAggGrade() {
        return aggGrade;
    }

    public void setAggGrade(double aggGrade) {
        this.aggGrade = aggGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", age=" + age +
                ", aggGrade=" + aggGrade +
                '}';
    }
}
