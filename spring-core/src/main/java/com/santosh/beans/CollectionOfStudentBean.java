package com.santosh.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "studentCollection")
@Data
@NoArgsConstructor
public class CollectionOfStudentBean {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "studentName")
	private String studentName;

	@Column(name = "age")
	private int age;

	@Column(name = "studentAddress")
	private String studentAddress;
//	private List<String> studentAddress;

	@Column(name = "subjectWithMarks")
	private String subjectWithMarks;
//	private Map<String, Integer> subjectWithMarks;

	@Column(name = "mobileNumbers")
	private Long mobileNumbers;
//	private Set<Long> mobileNumbers;
}
