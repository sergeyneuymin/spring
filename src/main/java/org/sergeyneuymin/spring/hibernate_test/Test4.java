package org.sergeyneuymin.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sergeyneuymin.spring.hibernate_test.entity.Employee;

public class Test4 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();

//            Employee employee = session.get(Employee.class,1);
//            employee.setSalary(1500);

            session.createQuery("update Employee set salary = 1000 where name = 'Oleg'").executeUpdate();

            session.getTransaction().commit();



        } finally {
            sessionFactory.close();
        }
    }

}
