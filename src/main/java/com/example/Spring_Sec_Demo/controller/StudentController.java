package com.example.Spring_Sec_Demo.controller;

import com.example.Spring_Sec_Demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Shashwat", "java"),
            new Student(2,"Bushan", "Power BI"),
            new Student(3,"Ekta", "Spring")
            ));

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("")
    public List<Student> getAllStudentRedirect(){
        return getAllStudent();
    }

    @GetMapping("students")
    public List<Student> getAllStudent(){
        return students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
}
