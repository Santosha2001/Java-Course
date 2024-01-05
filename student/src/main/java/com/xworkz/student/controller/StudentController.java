package com.xworkz.student.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.student.dto.StudentDTO;

@Controller
@RequestMapping("/")
public class StudentController {

	// Save the uploaded file to this folder
	private static String UPLOADED_FOLDER = "C:\\Users\\MY\\Desktop\\spring\\temp\\";

	public StudentController() {
		System.out.println("StudentController created..");
	}

	@PostMapping("/learner")
	public String saveDetails(Model model, @Valid StudentDTO dto, BindingResult result) {
		System.out.println("saveDetails invoked..");
		System.out.println("StudentDTO: " + dto);
		System.out.println("dto has errors: " + result.hasErrors());

		model.addAttribute("dto", dto);

		if (result.hasErrors()) {
			List<ObjectError> objectErrors = result.getAllErrors();
			objectErrors.forEach(a -> System.err.println(a.getObjectName() + " " + a.getDefaultMessage()));
			model.addAttribute("error", objectErrors);
			model.addAttribute("errormsg", "Not saved..");
			return "Student";
		} else {
			model.addAttribute("noErrorMsg", "Details saved..");
		}
		return "StudentSuccess";
	}

	// @RequestMapping(value = "/upload", method = RequestMethod.POST)
	@PostMapping("/upload") // //new annotation since 4.3
	public String singleFileUpload(@RequestParam("file") MultipartFile file, Model model) {

		if (file.isEmpty()) {
			model.addAttribute("noFile", "File not saved.");
			return "StudentSuccess";
		}

		try {

			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

			model.addAttribute("saved", "Uploadded.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "uploadStatus";
	}

}
