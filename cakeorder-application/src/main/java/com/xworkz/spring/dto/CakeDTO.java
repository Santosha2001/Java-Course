package com.xworkz.spring.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CakeDTO {
	@NotEmpty
	@Size(min = 3, max = 20, message = "Customer name length is not match")
	@Pattern(regexp = "^[A-Za-z]", message = "Customer name pattern not valid")
	private String customerName;

	@NotNull
	@Email
	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "Email is not valid")
	private String customerEmail;

	@NotEmpty(message = "Please select a flavour")
	private String flavour;

	@NotEmpty(message = "Please select a weight")
	private String weight;

	@NotNull(message = "Price must not be empty")
	@Min(100)
	@Max(1000)
	private Integer price;

	private boolean takeAway;
}
