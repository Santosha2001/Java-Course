package com.xworkz.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.dto.ScientistDTO;
import com.xworkz.service.ScientistService;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class ScientistController {

	@Autowired
	private ScientistService scientistService;

	public ScientistController() {
		System.out.println("ScientistController");
	}

	@PostMapping("/science")
	public String saveScientist(Model model, @Valid ScientistDTO dto, BindingResult errors) {
		System.out.println("Details of the ScientistDTO:" + dto);
		System.out.println("Details of the ScientistDTO is valid:" + errors.hasErrors());

		model.addAttribute("dto", dto);
		 
		if (errors.hasErrors()) {

			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(a -> System.err.println(a.getObjectName() + " " + a.getDefaultMessage()));
			model.addAttribute("error", objectErrors);
			model.addAttribute("err", "Details can't save");
			return "Scientist";
		} else {
			boolean save = this.scientistService.saveAndValidate(dto);
			if (save) {
				System.out.println("DTO SAVED: " + save);
				model.addAttribute("noError", "Detils saved.");
			}
			return "ScientistScuccess";
		}

	}
}
