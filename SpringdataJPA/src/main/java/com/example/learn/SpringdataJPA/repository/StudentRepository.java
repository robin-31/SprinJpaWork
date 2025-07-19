package com.example.learn.SpringdataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.learn.SpringdataJPA.Entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	
	public List<Student> findByStudentName(String studentName);
	
	public List<Student> findByStudentNameContaining(String studentName);
	
	@Query("Select s from Student s where s.city = ?1 ")  //JPA query used to fetch the record on basis of same city//
	public List<Student> findbyCity(String city);
	
	@Query(
			nativeQuery = true,
			value = "Select * from \"JPA\".\"student_prod\" where city = ?1")
	public List<Student> findbyCityUsingNative(String city);
	
	/*
	 * @Query( nativeQuery = true, value = )
	 */
	@Query(
nativeQuery = true,
value = "Select * from \"JPA\".\"student_prod\" where city = ?1 and course = ?2")
	public List<Student> findByCourseAndCity(String city , String course);
	
}
