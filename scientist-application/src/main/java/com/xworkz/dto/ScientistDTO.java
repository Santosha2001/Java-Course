package com.xworkz.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ScientistDTO {

	@NotNull(message = "Name can't be empty")
	@Size(min = 3, max = 20, message = "Name should be in specified range.")
	private String scientistName;

	@NotEmpty(message = "Please select a field")
	private String field;

	@NotNull(message = "Experience can't be empty.")
	private Integer experience;

	@NotEmpty(message = "Please select a country")
	private String country;

	@NotNull(message = "Achivement can't be empty")
	@Size(min = 3, max = 20, message = "Achivement should be in specified range.")
	private String achivement;
}
