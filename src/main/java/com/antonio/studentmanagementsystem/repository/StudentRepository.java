package com.antonio.studentmanagementsystem.repository;

import com.antonio.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Optional
public interface StudentRepository extends JpaRepository<Student, Long> {

}
