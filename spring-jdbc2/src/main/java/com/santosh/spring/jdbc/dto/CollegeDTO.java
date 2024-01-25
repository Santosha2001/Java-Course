package com.santosh.spring.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollegeDTO {

	private int id;
	private String collegeName;
	private String collegeCity;
	private String universityName;
	private int noOfColleges;
	private int noOfStudents;

}
