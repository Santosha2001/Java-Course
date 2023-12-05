package com.xworkz.assignment18.inheritance.boot;

import com.xworkz.assignment18.inheritance.app6.*;

public class PersonMain {
	public static void main(String[] args) {
		Person person=new Person();
		person.personMethod();
		System.out.println("-------------------");
		
		Employee employee=new Employee();
		Person employee1=new Employee();
		employee.empMethod();
		employee.personMethod();
		System.out.println("-------------------");
		
		Player player=new Player();
		Person player1=new Player();
		player.playerMethod();
		player.personMethod();
		System.out.println("-------------------");
		
		Student student=new Student();
		Person studenet1=new Student();
		student.studentMethod();
		student.personMethod();
	}
}
