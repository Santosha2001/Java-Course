package com.santosh.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "studentInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "studentName")
	private String studentName;

	@Column(name = "studentAge")
	private int studentAge;

	@Column(name = "studentMobile")
	private long studentMobile;

	@Column(name = "studentAddress")
	private String studentAddress;
}
