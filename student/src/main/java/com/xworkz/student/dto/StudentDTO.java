package com.xworkz.student.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class StudentDTO {
	@NotNull
	@Size(min = 3, max = 30, message = "Please enter the name.")
	private String name;

	@NotNull
	@Size(min = 3, max = 30, message = "Please enter the college name.")
	private String college;

	@NotNull
	@Size(min = 3, max = 30, message = "Please enter the id.")
	private String studentId;

	@NotEmpty(message = "Please select a semester")
	private String semester;

	@NotNull(message = "Please enter the year.")
	private Integer year;
}
