package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class FetchData {
        public static void main(String[] args) {


            SessionFactory sf = new Configuration()
                    .addAnnotatedClass(org.example.Student.class)   //mention the annotated class
                    .configure()
                    .buildSessionFactory();


            Session session = sf.openSession();


            List<Student> students = session.createQuery("from Student", Student.class).getResultList();

            Student s1 = session.find(Student.class, 1);



            //close connections
            sf.close();
            session.close();

            for (Student s : students) {
                System.out.println(s);
            }

            System.out.println(s1.toString());
        }
}
