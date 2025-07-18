package com.example.learn.SpringdataJPA.Entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@AttributeOverrides(
		{
			@AttributeOverride(name = "stream",
					column = @Column(name = "course")
					),

			@AttributeOverride(name = "percentage",
					column = @Column(name = "cgpa")
					),

			@AttributeOverride(name = "school_name",
					column = @Column(name = "college_name")
					),

			@AttributeOverride(name = "passing_year",
					column = @Column(name = "passout_year")
					)
			
		})
public class StudentCollegeInfo {
	
	private String stream;
	private String percentage;
	private String school_name;
	private String passing_year;

}
