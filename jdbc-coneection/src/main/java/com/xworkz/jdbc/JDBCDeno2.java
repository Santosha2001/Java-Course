package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class JDBCDeno2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/city";
		String userName = "root";
		String password = "Xworkzodc@123";

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String fetchQuery = "SELECT * FROM location";
//		String fetchQuery1 = "select * from location where id>5";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(fetchQuery);

			while (resultSet.next()) {
				System.out.println("id: " + resultSet.getInt(1));
				System.out.println("cityName: " + resultSet.getString("cityName"));
				System.out.println("pincode: " + resultSet.getInt("pincode"));

				System.out.println("state: " + resultSet.getString("state"));
				System.out.println("***********************************");
			}

			// findColumn() to find the column number
			System.out.println(resultSet.findColumn("state"));
//			System.out.println("cityName: " + resultSet.getString(4));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
