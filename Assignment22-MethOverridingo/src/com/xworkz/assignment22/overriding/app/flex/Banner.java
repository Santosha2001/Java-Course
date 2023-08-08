package com.xworkz.assignment22.overriding.app.flex;

public class Banner extends Flex {
	
	@Override
	public char flexZise(char size) {
		System.out.println("size of the flex in derived class: " + size);
		return 'S';
	}
}
