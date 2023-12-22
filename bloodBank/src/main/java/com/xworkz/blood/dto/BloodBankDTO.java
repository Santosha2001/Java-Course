package com.xworkz.blood.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BloodBankDTO {

	@NotNull
	@Size(min = 3, max = 20, message = "Name size is valid")
	private String name;

	@NotNull
	@Size(min = 2, max = 3, message = "Group is not valid")
	private String group;

	@NotNull
	@Size(min = 2, max = 3, message = "field not valid")
	private String alcohol;

	@NotNull
	@Size(min = 2, max = 3, message = "Sickness is not-valid")
	private String sickness;

	@NotNull
	@Min(10)
	@Max(70)
	private int age;
	
	@NotEmpty
	private String gender;
}
