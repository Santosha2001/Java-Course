package com.santosh.spring.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

	private int id;
	private String studentName;
	private String city;
	private long mobileNo;

}
