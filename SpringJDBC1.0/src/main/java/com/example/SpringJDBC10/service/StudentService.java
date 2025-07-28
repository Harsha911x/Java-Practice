package com.example.SpringJDBC10.service;

import com.example.SpringJDBC10.model.Student;
import com.example.SpringJDBC10.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        System.out.println("Student added to service class to implement logic.");

        repo.save(s);

    }

    public List<Student> getStudents() {

        return repo.findAll();
    }
}
