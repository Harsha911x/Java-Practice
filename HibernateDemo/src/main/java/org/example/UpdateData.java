package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdateData {
    public static void main(String[] args) {

        PersonalDetails pd = new PersonalDetails();
        pd.setAge(40);
        pd.setEmail("RachelZane@gmail.com");
        pd.setAddress("LA California");


        Student s1 =new Student();
        s1.setId(99);
        s1.setName("Rachel Zane");
        s1.setMarks(80);
        s1.setPd(pd);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)   //mention the annotated class
                .configure()
                .buildSessionFactory();


        Session session = sf.openSession();

        Transaction tf = session.beginTransaction();

        session.merge(s1);

        tf.commit();
        //close connections

        sf.close();
        session.close();

        System.out.println(s1.toString());
    }
}
