package com.example.SpringJDBC10;

import com.example.SpringJDBC10.model.Student;
import com.example.SpringJDBC10.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		Student s = context.getBean(Student.class);
		s.setUsn(101);
		s.setName("Harshavardhan");
		s.setMarks(100);

		StudentService service = context.getBean(StudentService.class);

		//service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
