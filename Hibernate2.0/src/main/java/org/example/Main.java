package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Laptop l1 = new Laptop();
//        l1.setLid(4);
//        l1.setBrand("HP");
//        l1.setModel("Omen");
//        l1.setRam(16);
//
//        Laptop l2 = new Laptop();
//        l2.setLid(5);
//        l2.setBrand("Asus");
//        l2.setModel("Lite max");
//        l2.setRam(8);
//
//        Laptop l3 = new Laptop();
//        l3.setLid(6);
//        l3.setBrand("Lenovo");
//        l3.setModel("ThinkPad");
//        l3.setRam(32);
//
//
//
//
//        Alien a1 = new Alien();
//        a1.setAid(106);
//        a1.setAname("Harvey");
//        a1.setTech("SQL");
//        a1.setLaptops(Arrays.asList(l1,l2,l3));
//
//        Alien a2 = new Alien();
//        a2.setAid(107);
//        a2.setAname("John");
//        a2.setTech("Python");
//
//        a2.setLaptops(List.of(l2));
//
//        Alien a3 = new Alien();
//        a3.setAid(108);
//        a3.setAname("Samuel");
//        a3.setTech("Java");
//        a3.setLaptops(List.of(l1,l3));
//
//
//        l1.setAliens(Arrays.asList(a1,a2,a3));
//        l2.setAliens(Arrays.asList(a1,a2));
//        l3.setAliens(Arrays.asList(a1,a3));


        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Laptop.class)
                .addAnnotatedClass(org.example.Alien.class)
                .buildSessionFactory();

        Session session = sf.openSession();


        Laptop l = session.find(Laptop.class, 5);

        System.out.println(l);




        session.close();
        sf.close();


    }

}