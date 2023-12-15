package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo5 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/jdbcdemo";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String insertValues = "insert into branch(clgId,branchName,noOflectures,hodName) values(?,?,?,?)";
		String fetch = "select * from branch";

		try (Connection connection = DriverManager.getConnection(url, userName, password);
				PreparedStatement preparedStatement = connection.prepareStatement(insertValues);
				ResultSet resultSet = preparedStatement.executeQuery(fetch);
				Scanner scanner = new Scanner(System.in);) {

			int clgId = 0;
			int noOfLectures = 0;

			try {
				System.out.print("Enter the clgId: ");
				clgId = Integer.parseInt(scanner.nextLine());

				System.out.print("Enter branch noOfLectures: ");
				noOfLectures = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			System.out.print("Enter branch name: ");
			String branchName = scanner.nextLine();

			System.out.print("Enter branch hodName: ");
			String hodName = scanner.nextLine();

			preparedStatement.setInt(1, clgId);
			preparedStatement.setString(2, branchName);
			preparedStatement.setInt(3, noOfLectures);
			preparedStatement.setString(4, hodName);

			preparedStatement.execute();

			System.out.println("values inserted to table2 ");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
