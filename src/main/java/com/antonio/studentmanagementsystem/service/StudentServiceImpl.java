package com.antonio.studentmanagementsystem.service;

import com.antonio.studentmanagementsystem.entity.Student;
import com.antonio.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(); //Method by spring data jpa, return a full list of students
    }
}
