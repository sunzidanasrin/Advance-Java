package com.urmi.service;

import com.urmi.Domain.Student;
import java.util.List;

public class Test {

    static StudentService studentservice;

    public static void main(String[] args) {

        studentservice = new StudentService();

        /*
        Student std = new Student(1001, "urmi");
        studentservice.save(std);
        Student std2 = new Student(1002, "Firoza");
        studentservice.save(std2);
        Student std4 = new Student(1001, "FirozaaaAfroz");
        studentservice.update(std4);

        studentservice.delete(1001);

        List<Student> list = studentservice.getStudents();
        for (Student s : list) {
            System.out.println("ID: " + s.getId() + " Name: " + s.getStudentName());
        }
        */
        Student s = studentservice.getStudent(1002);
        System.out.println("ID: " + s.getId() + " Name: " + s.getStudentName());
    }

}
