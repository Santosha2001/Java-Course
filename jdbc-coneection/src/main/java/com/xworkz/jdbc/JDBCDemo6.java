package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo6 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// update query: updating values of branch table.
		String updateQuery = "update branch set noOflectures=?,hodName=? where id=?";
		String fetch = "select * from branch";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
				ResultSet resultSet = preparedStatement.executeQuery(fetch);
				Scanner scanner = new Scanner(System.in);) {

			int bId = 0;
			int lecCount = 0;
			try {
				System.out.print("Enter the bId: ");
				bId = Integer.parseInt(scanner.nextLine());

				System.out.print("Enter the lecturesCount: ");
				lecCount = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			System.out.print("Enter the hodName: ");
			String hod = scanner.nextLine();

			preparedStatement.setInt(3, bId);
			preparedStatement.setInt(1, lecCount);
			preparedStatement.setString(2, hod);

			System.out.println("values updated...");

			while (resultSet.next()) {
				System.out.println("***************************");
				System.out.println("bId: " + resultSet.getInt("id"));
				System.out.println("clgId: " + resultSet.getInt("clgId"));
				System.out.println("branchName: " + resultSet.getString("branchName"));
				System.out.println("noOflectures: " + resultSet.getInt("noOflectures"));
				System.out.println("hodName: " + resultSet.getString("hodName"));
			}

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
