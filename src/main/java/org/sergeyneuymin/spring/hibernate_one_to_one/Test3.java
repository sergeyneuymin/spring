package org.sergeyneuymin.spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sergeyneuymin.spring.hibernate_one_to_one.entity.Detail;
import org.sergeyneuymin.spring.hibernate_one_to_one.entity.Employee;


public class Test3 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;
        try {

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 5);
            // delete from table set ref to null
            detail.getEmployee().setEmpDetail(null);
            session.remove(detail);
            session.getTransaction().commit();
            System.out.println("Done");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }

}
