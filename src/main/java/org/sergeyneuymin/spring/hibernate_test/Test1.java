package org.sergeyneuymin.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sergeyneuymin.spring.hibernate_test.entity.Employee;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            Employee employee = new Employee("Ivan", "Ivanov", "HR", 500);

            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }

}
