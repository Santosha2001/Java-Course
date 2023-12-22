package com.xworkz.button.component;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class ButtonClick {

	public ButtonClick() {
		System.out.println("ButtonClick created..");
	}

	public ArrayList<Integer> getNumbers() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			arrayList.add(i);
		}

		return arrayList;
	}

	public String showNumbers(Model model) {
		model.addAttribute("numbers", getNumbers());
		return "index.jsp";
	}

	@PostMapping("/test")
	public String click(Model model, @RequestParam("barbarName") String barbarName, @RequestParam("date") String date,
			@RequestParam("time") String time, @RequestParam("email") String email,
			@RequestParam("location") String location, @RequestParam("mobileNumber") String mobileNumber,
			@RequestParam("purpose") String purpose, @RequestParam("age") String age,
			@RequestParam("gender") String gender, @RequestParam("member") String member,
			@RequestParam("payment") String payment) {
		System.out.println("button clicked..");
		model.addAttribute("msg", "Details saved..");
		System.out.println("barbarName: " + barbarName);
		System.out.println("date: " + date);
		System.out.println("time: " + time);
		System.out.println("email: " + email);
		System.out.println("location: " + location);
		System.out.println("mobileNumber: " + mobileNumber);
		System.out.println("purpose: " + purpose);
		System.out.println("age: " + age);
		System.out.println("purpose: " + purpose);
		System.out.println("gender: " + gender);
		System.out.println("member: " + member);
		System.out.println("payment: " + payment);

		return "index.jsp";
	}

}
