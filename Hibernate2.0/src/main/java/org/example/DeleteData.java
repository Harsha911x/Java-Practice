package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)   //mention the annotated class
                .configure()
                .buildSessionFactory();


        Session session = sf.openSession();

        Student s1 = session.find(Student.class, 99);

        Transaction tf = session.beginTransaction();

        session.remove(s1);

        tf.commit();
        //close connections

        sf.close();
        session.close();

        System.out.println(s1.toString());
    }
}
