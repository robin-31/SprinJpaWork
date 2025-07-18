package com.example.learn.SpringdataJPA.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_prod",
uniqueConstraints = @UniqueConstraint(
		columnNames = "mail_ID",
		name = "unquie_mailID"))
public class Student {
	
	@Id
	@SequenceGenerator(
			allocationSize = 1,
			sequenceName = "student_sequence",
			name = "student_sequence"
			)
	@GeneratedValue(
			generator = "student_sequence",
			strategy = GenerationType.SEQUENCE)
	private Long studentId;
	private String studentName;
	
	@Column(
			nullable = false,
			name = "mail_ID")
	private String mail_ID;
	private String city;
	
	@Embedded
	private StudentCollegeInfo collegeinfo;
	
	
	
	
	
	
	
	
	
	
	

}
