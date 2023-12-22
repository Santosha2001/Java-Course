package com.xworkz.blood.config.component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.blood.dto.BloodBankDTO;

@Component
@RequestMapping("/")
public class BloodBankApplication {
	@RequestMapping("/blood")
	public String savedDetails(@Valid BloodBankDTO dto, BindingResult errors) {

		System.out.println("Details of the donor:" + dto);
		System.out.println("Is blood group dto valid: " + errors.hasErrors());

		List<ObjectError> objectErrors = errors.getAllErrors();
		objectErrors.forEach(a -> System.out.println(a.getObjectName() + ": message" + a.getDefaultMessage()));

		return "index";
	}
}
