package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "student_table")
public class Student {
    @Id
    private int id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "s_marks")
    private int marks;

    @Embedded
    private PersonalDetails pd;

    @OneToOne
    @JoinColumn(name = "dept_id")
    private Department department;



//    //when you don't want it to be save din database
//    @Transient
//    private int age;

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public PersonalDetails getPd() {
        return pd;
    }


    public void setPd(PersonalDetails pd) {
        this.pd = pd;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", pd=" + pd +
                ", department=" + department +
                '}';
    }
}
