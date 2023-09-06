package com.xworkz.assignment36.boot;

import com.xworkz.assignment36.app.repositary.TrainNoRepositary;
import com.xworkz.assignment36.app.repositary.TrainNoRepositaryImpl;
import com.xworkz.assignment36.app.services.TrainNoservice;
import com.xworkz.assignment36.app.services.TrainNoserviceImpl;

public class TrainNoMain {

	public static void main(String[] args) {
		TrainNoRepositary noRepositary = new TrainNoRepositaryImpl();

		TrainNoservice noservice = new TrainNoserviceImpl(noRepositary);

		long[] numbers = { 12080, 17392, 16590, 0, 16590 };

		for (long l : numbers) {
			noservice.trainNoValidate(l);
		}
	}
}
