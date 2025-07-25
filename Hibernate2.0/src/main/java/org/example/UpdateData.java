package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdateData {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(3);
        l1.setBrand("HP");
        l1.setModel("Victus");
        l1.setRam(24);


        Alien a1 = new Alien();
        a1.setAid(103);
        a1.setAname("Vardhan");
        a1.setTech("C++");
        a1.setLaptop(l1);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Laptop.class)
                .addAnnotatedClass(org.example.Alien.class) //mention the annotated class
                .configure()
                .buildSessionFactory();


        Session session = sf.openSession();

        Transaction tf = session.beginTransaction();

        session.merge(a1);

        tf.commit();
        //close connections

        sf.close();
        session.close();

        //System.out.println(s1.toString());
    }
}
