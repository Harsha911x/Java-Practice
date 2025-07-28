package org.example;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


@Primary
//or use Qualifier in calling class
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop object created");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }

}
