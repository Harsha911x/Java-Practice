package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // Create Department object
        Department d1 = new Department();
        d1.setId(3); // If 1 already exists, ignore exception
        d1.setDname("ECE");
        d1.setLocation("India");

        // Create PersonalDetails object and set values
        PersonalDetails pd = new PersonalDetails();
        pd.setAge(28);
        pd.setAddress("UK");
        pd.setEmail("emily@gmail.com");

        // Create Student object and associate personal details
        Student s1 = new Student();
        s1.setId(3); // If 100 already exists, ignore exception
        s1.setName("Emily Blunt");
        s1.setMarks(88);
        s1.setPd(pd);
        s1.setDepartment(d1);




        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {

            // Check if Department already exists
            Department existingDept = session.find(Department.class, d1.getId());
            if (existingDept == null) {
                session.persist(d1);
            } else {
                System.out.println("Department with given ID  already exists. Skipping insert.");
            }


            // Check if Student already exists
            Student existingStudent = session.find(Student.class, s1.getId());
            if (existingStudent == null) {
                session.persist(s1);
            } else {
                System.out.println("Student with given ID  already exists. Skipping insert.");
            }



            transaction.commit();

        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
            transaction.rollback();
        }

        session.close();
        sessionFactory.close();


        // Print Student object
        System.out.println(s1);
        System.out.println(d1);
    }
}
