package com.santosh.spring.jdbc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDAO {

	private int id;
	private String studentName;
	private String city;
	private long mobileNo;

}
