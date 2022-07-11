package com.antonio.studentmanagementsystem;

import com.antonio.studentmanagementsystem.entity.Student;
import com.antonio.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	//this method executes when we run the spring boot application
	//logic to insert the records to the table

	@Autowired //Inject to use studentRepository methods
	private StudentRepository studentRepository;
/*
	@Override
	public void run(String... args) throws Exception {

		Student student1=new Student("Antonio","Navas","antonio@gmail.com");
		studentRepository.save(student1);

		Student student2=new Student("Paco","Romero","paco@gmail.com");
		studentRepository.save(student2);

		Student student3=new Student("Marta","Fernandez","marta@gmail.com");
		studentRepository.save(student3);

	}*/
}
