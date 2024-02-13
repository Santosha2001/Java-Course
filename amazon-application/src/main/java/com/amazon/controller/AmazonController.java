package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazon.dto.AmazonDTO;

@Controller
@RequestMapping("/")
public class AmazonController {

	public AmazonController() {
		System.out.println("AmazonController created..");
	}

	@PostMapping("/cart")
	public String product(@ModelAttribute AmazonDTO amazonDTO) {
		System.out.println("Cart creating..");
		System.out.println(amazonDTO);

		return "Success.jsp";
	}
}
