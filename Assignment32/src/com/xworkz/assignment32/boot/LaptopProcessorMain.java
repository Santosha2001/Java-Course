package com.xworkz.assignment32.boot;

import com.xworkz.assignment32.app.LaptopProcessor;
import com.xworkz.assignment32.app.Processor;

public class LaptopProcessorMain {

	public static void main(String[] args) {
		LaptopProcessor laptopProcessor = new LaptopProcessor("hp", 512, 10000, 250);

		Processor processor = new Processor();

		laptopProcessor.setProcess(processor);

	}
}
