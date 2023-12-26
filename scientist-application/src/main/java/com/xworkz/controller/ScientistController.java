package com.xworkz.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.dto.ScientistDTO;

@Configuration
@EnableWebMvc
@RequestMapping("/")
public class ScientistController {
	public ScientistController() {
		System.out.println("ScientistController");
	}

	@PostMapping("/science")
	public String saveScientist(Model model, @Valid ScientistDTO dto, BindingResult errors) {
		System.out.println("Details of the ScientistDTO:" + dto);
		System.out.println("Details of the ScientistDTO is valid:" + errors.hasErrors());

		model.addAttribute("dto", dto);
		List<ObjectError> objectErrors = null;
		if (errors.hasErrors()) {

			objectErrors = errors.getAllErrors();
			objectErrors.forEach(a -> System.err.println(a.getObjectName() + " " + a.getDefaultMessage()));
			model.addAttribute("error", objectErrors);
			return "Scientist";
		} else {
			model.addAttribute("noError", "Detils saved.");
			return "ScientistScuccess";
		}

	}
}
