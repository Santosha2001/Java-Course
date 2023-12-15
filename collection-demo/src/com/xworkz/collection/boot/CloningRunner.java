package com.xworkz.collection.boot;

import java.time.LocalDate;

import com.xworkz.collection.app.dto.CloningDemo;

public class CloningRunner {

	public static void main(String[] args) {
		CloningDemo cloningDemo = new CloningDemo("Santhu", 22, "DVG", LocalDate.now());

		try {
			CloningDemo cloningDemo2 = (CloningDemo) cloningDemo.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println();
//			e.printStackTrace();
		}
		
	}
}
