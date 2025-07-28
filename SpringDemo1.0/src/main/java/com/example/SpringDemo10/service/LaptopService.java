package com.example.SpringDemo10.service;

import com.example.SpringDemo10.repo.LaptopRepository;
import com.example.SpringDemo10.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public  void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGoodProg(Laptop lap){
        return true;
    }
}
