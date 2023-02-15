package org.sergeyneuymin.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sergeyneuymin.spring.hibernate_test.entity.Employee;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            //Employee employee = new Employee("Oleg", "Sidorov", "HR", 600);

            session.beginTransaction();
            //session.persist(employee);
            //session.getTransaction().commit();


            List<Employee> employeeList = session.createQuery("from Employee where name = 'Elena' AND salary > 100")
                    .getResultList();

            for(Employee e : employeeList) {
                System.out.println(e.toString());
            }


            //int myId = employee.getId();

            //Session newSession = sessionFactory.getCurrentSession();
           // newSession.beginTransaction();
           // Employee emp = session.get(Employee.class,myId);
            session.getTransaction().commit();

            //System.out.println(emp.getName());

        } finally {
            sessionFactory.close();
        }
    }

}
