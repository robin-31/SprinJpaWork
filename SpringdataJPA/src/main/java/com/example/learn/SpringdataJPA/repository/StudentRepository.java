package com.example.learn.SpringdataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learn.SpringdataJPA.Entity.Student;






@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
}
