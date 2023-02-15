package org.sergeyneuymin.spring.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sergeyneuymin.spring.hibernate_one_to_many_bi.entity.Department;
import org.sergeyneuymin.spring.hibernate_one_to_many_bi.entity.Employee;


public class Test1 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class).buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();


            session.beginTransaction();

            Department department = new Department("Sales",1000,500);
            Employee employee = new Employee("Oleg","Smirnova", 1000);
            Employee employee2 = new Employee("Anton","Sidorov", 900);
            Employee employee3 = new Employee("Gleb","Sidorov", 900);

            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment(employee2);
            department.addEmployeeToDepartment(employee3);
            session.persist(department);
//
//            Department department = session.get(Department.class, 1);
//            System.out.println(department.getEmps());

            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }

}
