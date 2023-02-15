package org.sergeyneuymin.spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sergeyneuymin.spring.hibernate_one_to_one.entity.Detail;
import org.sergeyneuymin.spring.hibernate_one_to_one.entity.Employee;


public class Test1 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();

//            Employee employee = new Employee("Oleg","Smirnov","IT", 1000);
//            Detail detail = new Detail("Chelyabinsk","890000000","email@email.com");
//            employee.setEmpDetail(detail);

            session.beginTransaction();
            //session.persist(employee);
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee.getEmpDetail());
            Employee employee = session.get(Employee.class,2);
            session.remove(employee);
            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

}
