package com.xworkz.collection.boot;

import java.io.File;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		File file = new File("santhu.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created successfuly: " + file.getName());
				System.out.println("File Path: " + file.getAbsolutePath());
			} else {
				System.out.println("File already exist:");
				System.out.println("file path--> " + file.getPath());
				file.delete();
				System.out.println("File deleted:");
			}
		} catch (IOException e) {
			System.out.println(" Error occured whikke creating file:");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
