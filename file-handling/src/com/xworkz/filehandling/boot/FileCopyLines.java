package com.xworkz.filehandling.boot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopyLines {

	public static void main(String[] args) {

		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C://Users//MY//Desktop//spring/input.txt"));
				PrintWriter printWriter = new PrintWriter(new FileWriter("C://Users//MY//Desktop//spring/out.txt"));) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				printWriter.print(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
