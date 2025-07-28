package com.example.SpringDemo10.repo;

import com.example.SpringDemo10.model.Laptop;

import org.springframework.stereotype.Repository;

// To connect to JDBC and database
@Repository
public class LaptopRepository {


    public void save(Laptop lap){
        System.out.println("Saved in Database...");
    }
}
