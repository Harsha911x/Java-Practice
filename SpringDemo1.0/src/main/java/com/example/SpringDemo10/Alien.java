package com.example.SpringDemo10;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//annotation to tell spring it is a object
@Component
public class Alien {

    private int id;
    private String name;
    private String tech;

    @Autowired
    Laptop laptop;

    public void code(){
        System.out.println("LEtss gooo!!!!!!!!!!!");
        laptop.compile();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
