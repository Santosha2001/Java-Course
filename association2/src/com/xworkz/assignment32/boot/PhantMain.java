package com.xworkz.assignment32.boot;

import com.xworkz.assignment32.app.Phant;
import com.xworkz.assignment32.app.Zip;

public class PhantMain {

	public static void main(String[] args) {
		Zip zip = new Zip();
		Phant phant = new Phant(zip, 'M');

		phant.color();
	}

}
