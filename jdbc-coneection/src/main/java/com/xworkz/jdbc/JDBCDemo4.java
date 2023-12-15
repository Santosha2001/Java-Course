package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "Xworkzodc@123";
		try {
			// 1.Load and register Driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// String createdb = "create database jdbcdemo";
		String insertValue = "insert into college(clgName,clgLocation,university) values(?,?,?)";
		String fetch = "select * from college";

		// 2. Establish connection with database.
		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement statement = connection.prepareStatement(insertValue);
				ResultSet resultSet = statement.executeQuery(fetch);
				Scanner scanner = new Scanner(System.in);) {

			System.out.print("Enter the college name: ");
			String collegeName = scanner.nextLine();

			System.out.print("Enter the college location: ");
			String collegeLocation = scanner.nextLine();

			System.out.print("Enter the university name: ");
			String universityName = scanner.nextLine();

			statement.setString(1, collegeName);
			statement.setString(2, collegeLocation);
			statement.setString(3, universityName);
			statement.executeUpdate();
			System.out.println("values inserted to table ...");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
