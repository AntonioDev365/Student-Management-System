package com.antonio.studentmanagementsystem.controller;

import com.antonio.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //handler method to handle list students and return model and view
    @GetMapping("/students")
    public String listStudents(Model theModel){
        theModel.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
}
