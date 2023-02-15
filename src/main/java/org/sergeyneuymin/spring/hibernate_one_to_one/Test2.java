package org.sergeyneuymin.spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sergeyneuymin.spring.hibernate_one_to_one.entity.Detail;
import org.sergeyneuymin.spring.hibernate_one_to_one.entity.Employee;


public class Test2 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;
        try {

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            // bi-directional 2 setters --------------------------------------------------------------------
            Employee employee = new Employee("Misha","Ivanov","IT", 1000);
            Detail detail = new Detail("SPB","890000000","email@email.com");

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.persist(detail);
            session.getTransaction().commit();

            // bi-directional --------------------------------------------------------------------

            System.out.println("Done");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }

}
