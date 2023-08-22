package com.xworkz.assignment28.app;

import java.nio.charset.Charset;

public class StringClass {
	public StringClass() {

		System.out.println("Calling No-arg Constructor....");
	}

	public StringClass(byte[] bytes, Charset charset) {
		System.out.println("Calling 2 paramerteized Constructor....");

	}

	public StringClass(char[] value) {
		System.out.println("Calling 1 paramerteized Constructor....");

	}
}
