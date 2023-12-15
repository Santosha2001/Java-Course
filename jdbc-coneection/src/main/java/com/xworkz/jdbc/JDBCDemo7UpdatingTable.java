package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo7UpdatingTable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "Xworkzodc@123";

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String updateQuery = "UPDATE student SET bId=?, fName=?, lName=?, sem=?, addrs=? where sId=?";
		String fetch = "SELECT * FROM student";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
				ResultSet resultSet = preparedStatement.executeQuery(fetch);
				Scanner scanner = new Scanner(System.in);) {

			int bId = 0;
			int sem = 0;
			int sId = 0;

			try {
				System.out.print("Enter the bId: ");
				bId = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter the sem: ");
				sem = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter the sId: ");
				sId = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			System.out.print("Enter the fanme: ");
			String fName = scanner.nextLine();
			System.out.print("Enter the lanme: ");
			String lName = scanner.nextLine();
			System.out.print("Enter the addrs: ");
			String addrs = scanner.nextLine();

			preparedStatement.setInt(1, bId);
			preparedStatement.setString(2, fName);
			preparedStatement.setString(3, lName);
			preparedStatement.setInt(4, sem);
			preparedStatement.setString(5, addrs);
			preparedStatement.setInt(6, sId);

			preparedStatement.executeUpdate();

			System.out.println("values updated....");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
