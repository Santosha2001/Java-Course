package com.xworkz.assignment25.abstrct.boot;

import com.xworkz.assignment25.abstrct.app.employee.Developer;
import com.xworkz.assignment25.abstrct.app.employee.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Developer();
		employee.attendMeeting();
		employee.takeBreak();
		employee.submitReport();
		employee.work();
		
		System.out.println("\n");
		
		employee.displaySalary();
		employee.calculateBonus();
		employee.displayDetails();
		employee.promote();
	}
}
