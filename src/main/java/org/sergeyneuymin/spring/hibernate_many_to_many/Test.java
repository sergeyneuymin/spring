package org.sergeyneuymin.spring.hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sergeyneuymin.spring.hibernate_many_to_many.entity.Child;
import org.sergeyneuymin.spring.hibernate_many_to_many.entity.Section;

public class Test {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {

            session = sessionFactory.getCurrentSession();
            Section section1 = new Section("Football");
            Section section2 = new Section("Chess");
            Section section3 = new Section("MAth");

            Child child1 = new Child("Igor", 5);
            Child child2 = new Child("Vova", 6);
            Child child3 = new Child("Anna", 7);



            session.beginTransaction();
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.persist(section1);

            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }


}
