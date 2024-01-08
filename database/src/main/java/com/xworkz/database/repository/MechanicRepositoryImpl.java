package com.xworkz.database.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.database.dto.MechanicDTO;

public class MechanicRepositoryImpl implements MechanicRepository {

	@Override
	public void saveMechaincDetail(MechanicDTO dto) {
		String url = "jdbc:mysql://localhost:3306/automobile";
		String usename = "root";
		String password = "Xworkzodc@123";

		// Load Driver class
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Query
		String insertQuery = "insert into mechanic(m_name,expe,garage_name) values (?,?,?)";

		// Establish connection
		try (Connection connection = DriverManager.getConnection(url, usename, password);
				PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.setString(1, dto.getMechanicName());
			preparedStatement.setInt(2, dto.getExperience());
			preparedStatement.setString(3, dto.getGarage_name());

			preparedStatement.executeUpdate();
			System.out.println("Values inserted successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
