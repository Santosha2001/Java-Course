package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDEMO3 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/city";
		String username = "root";
		String passwprd = "Xworkzodc@123";

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		String query = "insert into location(id,cityName,pincode,state) values(?,?,?,?)";
		String query1 = "select * from location";
		try {
			connection = DriverManager.getConnection(url, username, passwprd);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 11);
			preparedStatement.setString(2, "Hydrabad");
			preparedStatement.setInt(3, 569354);
			preparedStatement.setString(4, "Maharastra");

			preparedStatement.setInt(1, 12);
			preparedStatement.setString(2, "Chennai");
			preparedStatement.setInt(3, 569364);
			preparedStatement.setString(4, "Tamilnadus");
			preparedStatement.execute();

			resultSet = preparedStatement.executeQuery(query1);

			while (resultSet.next()) {
				System.out.println("id: " + resultSet.getInt(1));
				System.out.println("cityName: " + resultSet.getString("cityName"));
				System.out.println("pincode: " + resultSet.getInt("pincode"));
				System.out.println("state: " + resultSet.getString("state"));
				System.out.println("***********************************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (resultSet != null) {

				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
