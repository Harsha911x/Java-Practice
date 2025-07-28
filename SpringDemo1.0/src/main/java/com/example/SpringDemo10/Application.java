package com.example.SpringDemo10;

import com.example.SpringDemo10.model.Alien;
import com.example.SpringDemo10.model.Laptop;
import com.example.SpringDemo10.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);


		LaptopService service = context.getBean(LaptopService.class);


		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		Alien a = context.getBean(Alien.class);
//		a.code();
//		System.out.println(a.getAge());


	}

}
