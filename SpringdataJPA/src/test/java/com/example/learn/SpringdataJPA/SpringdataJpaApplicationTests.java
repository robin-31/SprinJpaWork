package com.example.learn.SpringdataJPA;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.learn.SpringdataJPA.Entity.Student;
import com.example.learn.SpringdataJPA.Entity.StudentCollegeInfo;
import com.example.learn.SpringdataJPA.repository.StudentRepository;


@SpringBootTest
class SpringdataJpaApplicationTests {

@Autowired	
StudentRepository studentRepository;

@Test
public void saveStudents() {
	//Student student = Student;

	StudentCollegeInfo collegeInfo = StudentCollegeInfo.builder().
			passing_year("2K16").
			percentage("9CGP").
			school_name("MMU").
			stream("MCA").build();
	Student student = Student.builder().
			city("Mumbai").
			mail_ID("deva@gmail.com").
			studentName("Deva mahajan").
			collegeinfo(collegeInfo).build();
		studentRepository.save(student);
		System.out.println("added one record");
		
		StudentCollegeInfo collegeInfo1 = StudentCollegeInfo.builder().
				passing_year("2K15").
				percentage("8.5 CGP").
				school_name("KMU").
				stream("B.TECH").build();
		Student student1 = Student.builder().
				city("Kanpur").
				mail_ID("niraj@gmail.com").
				studentName("Niraj pandey").
				collegeinfo(collegeInfo1).build();
			studentRepository.save(student1);
			System.out.println("added 2nd record");
	
	
}

@Test
public void showStudent() {
	
	List<Student> students = studentRepository.findAll();
	
	System.out.println("fetched record from DB :" + students);
	
}
	
	
	

	
}
