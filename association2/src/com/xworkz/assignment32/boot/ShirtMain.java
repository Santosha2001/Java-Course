package com.xworkz.assignment32.boot;

import com.xworkz.assignment32.app.Button;
import com.xworkz.assignment32.app.Shirt;

public class ShirtMain {

	public static void main(String[] args) {
		Shirt shirt = new Shirt('M');
		Button button = new Button();

		shirt.setButton(button);
		
		shirt.color();
	}
}
