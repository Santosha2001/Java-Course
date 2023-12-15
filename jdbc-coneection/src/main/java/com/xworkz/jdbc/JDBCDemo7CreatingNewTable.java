package com.xworkz.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo7CreatingNewTable {
	// dependencies are used to configure the database

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String usename = "root";
		String password = "Xworkzodc@123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// insert value to the table query
		String insertValueQuery = "INSERT INTO student(bId,fName,lName,sem,addrs,state) VALUES (?,?,?,?,?,?)";
		String fetch = "SELECT * FROM student";

		try (Connection connection = DriverManager.getConnection(url, usename, password);
				PreparedStatement preparedStatement = connection.prepareStatement(insertValueQuery);
				ResultSet resultSet = preparedStatement.executeQuery(fetch);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {

			int bid = 0;
			int sem = 0;

			try {
				System.out.print("Enter the bid: ");
				bid = Integer.parseInt(bufferedReader.readLine());

				System.out.print("Enter the sem: ");
				sem = Integer.parseInt(bufferedReader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			System.out.print("Enter the fname: ");
			String fname = bufferedReader.readLine();

			System.out.print("Enter the lname: ");
			String lname = bufferedReader.readLine();

			System.out.print("Enter the addrs: ");
			String addrs = bufferedReader.readLine();

			System.out.print("Enter the state: ");
			String state = bufferedReader.readLine();

			preparedStatement.setInt(1, bid);
			preparedStatement.setInt(4, sem);
			preparedStatement.setString(2, fname);
			preparedStatement.setString(3, lname);
			preparedStatement.setString(5, addrs);
			preparedStatement.setString(6, state);

			preparedStatement.execute();

			System.out.println("values inserted...");

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}
}
