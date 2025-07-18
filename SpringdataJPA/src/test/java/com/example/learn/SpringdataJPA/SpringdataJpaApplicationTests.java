package com.example.learn.SpringdataJPA;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.learn.SpringdataJPA.Entity.Student;


import com.example.learn.SpringdataJPA.repository.StudentRepository;


@SpringBootTest
class SpringdataJpaApplicationTests {

@Autowired	
StudentRepository studentRepository;

@Test
public void saveStudents() {
	Student student = Student.class.b ;
	
}
	
	
	

	
}
