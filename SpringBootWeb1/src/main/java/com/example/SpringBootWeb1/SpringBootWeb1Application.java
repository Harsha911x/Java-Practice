package com.example.SpringBootWeb1;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootWeb1Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootWeb1Application.class, args);

		//HomeController hc = context.getBean(HomeController.class);
	}


}
