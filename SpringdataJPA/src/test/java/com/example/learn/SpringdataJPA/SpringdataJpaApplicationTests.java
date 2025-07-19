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

@Test
public void printStudentByName() {
	List<Student> students = studentRepository.findByStudentName("Robin manna");
	System.out.println("Student name by passing input as robin manna :" + students);
	for(Student student : students) {
		System.out.println("-------------loop started from here------------------");
		System.out.println("Student name is :" + student.getStudentName());
		System.out.println("Student mail id is :" + student.getMail_ID());
		System.out.println("Student living in:" + student.getCity());
		System.out.println("course opt for :" + student.getCollegeinfo().getSchool_name());
		System.out.println("Batch yeas :" + student.getCollegeinfo().getPassing_year());
		System.out.println("Percentage secured :" + student.getCollegeinfo().getPercentage());
		System.out.println("-------------------------loop end here---------------------");
	}
	
}
	
@Test
public void printstudentNameByMatching() {
	List<Student> students = studentRepository.findByStudentNameContaining("N");
	System.out.println("Student name contain character as N:" + students);
	for(Student student : students) {
		System.out.println("-------------loop started from here------------------");
		System.out.println("Student name is :" + student.getStudentName());
		System.out.println("Student mail id is :" + student.getMail_ID());
		System.out.println("Student living in:" + student.getCity());
		System.out.println("course opt for :" + student.getCollegeinfo().getSchool_name());
		System.out.println("Batch yeas :" + student.getCollegeinfo().getPassing_year());
		System.out.println("Percentage secured :" + student.getCollegeinfo().getPercentage());
		System.out.println("-------------------------loop end here---------------------");
	}
}

@Test
public void findByCity() {
	List<Student> students = studentRepository.findbyCity("Delhi");
	System.out.println("Student name by passing input as robin manna :" + students);
	for(Student student : students) {
		System.out.println("-------------loop started from here------------------");
		System.out.println("Student name is :" + student.getStudentName());
		System.out.println("Student mail id is :" + student.getMail_ID());
		System.out.println("Student living in:" + student.getCity());
		System.out.println("course opt for :" + student.getCollegeinfo().getSchool_name());
		System.out.println("Batch yeas :" + student.getCollegeinfo().getPassing_year());
		System.out.println("Percentage secured :" + student.getCollegeinfo().getPercentage());
		System.out.println("-------------------------loop end here---------------------");
	}
	
}

@Test
public void findBySameCity() {
	List<Student> students =studentRepository.findbyCityUsingNative("Delhi");
	System.out.println("Student detais who's living in same city :" + students);
	for(Student student : students) {
		System.out.println("-------------loop started from here------------------");
		System.out.println("Student name is :" + student.getStudentName());
		System.out.println("Student mail id is :" + student.getMail_ID());
		System.out.println("Student living in:" + student.getCity());
		System.out.println("course opt for :" + student.getCollegeinfo().getSchool_name());
		System.out.println("Batch yeas :" + student.getCollegeinfo().getPassing_year());
		System.out.println("Percentage secured :" + student.getCollegeinfo().getPercentage());
		System.out.println("-------------------------loop end here---------------------");
	}
}

@Test
public void findStudentByCityAndCourse() {
	List<Student> students = studentRepository.findByCourseAndCity("Delhi", "MCA");
	System.out.println("Total numbers of recored we got from DB :" + students.size());
	for(Student student : students) {
		System.out.println("-------------loop started from here------------------");
		System.out.println("Student name is :" + student.getStudentName());
		System.out.println("Student mail id is :" + student.getMail_ID());
		System.out.println("Student living in:" + student.getCity());
		System.out.println("course opt for :" + student.getCollegeinfo().getSchool_name());
		System.out.println("Batch yeas :" + student.getCollegeinfo().getPassing_year());
		System.out.println("Percentage secured :" + student.getCollegeinfo().getPercentage());
		System.out.println("-------------------------loop end here---------------------");
	}
	
}
	
	

	
}
