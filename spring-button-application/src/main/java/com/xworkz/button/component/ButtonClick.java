package com.xworkz.button.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class ButtonClick {

	public ButtonClick() {
		System.out.println("ButtonClick created..");
	}

	@RequestMapping("/test")
	public String click() {
		System.out.println("button clicked..");
		return "index.jsp";
	}

}
