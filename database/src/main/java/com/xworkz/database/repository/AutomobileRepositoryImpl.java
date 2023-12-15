package com.xworkz.database.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.xworkz.database.dto.AutomobileDTO;

public class AutomobileRepositoryImpl implements AutomobileRepository {
	String url = "jdbc:mysql://localhost:3306/automobile";
	String usename = "root";
	String password = "Xworkzodc@123";

	public void saveDetails(AutomobileDTO automobileDTO) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String insertValues = "insert into vehicle(name,color,vehicleType,model) values(?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(url, usename, password);
				PreparedStatement preparedStatement = connection.prepareStatement(insertValues)) {

			preparedStatement.setString(1, automobileDTO.getName());
			preparedStatement.setString(2, automobileDTO.getColor());
			preparedStatement.setString(3, automobileDTO.getVehicleType());
			preparedStatement.setInt(4, automobileDTO.getModel());

			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveDetails(Set<AutomobileDTO> automobileDTOs) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String insertValues = "insert into vehicle(name,color,vehicleType,model) values(?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(url, usename, password);
				PreparedStatement preparedStatement = connection.prepareStatement(insertValues)) {

			for (AutomobileDTO automobileDTO : automobileDTOs) {
				preparedStatement.setString(1, automobileDTO.getName());
				preparedStatement.setString(2, automobileDTO.getColor());
				preparedStatement.setString(3, automobileDTO.getVehicleType());
				preparedStatement.setInt(4, automobileDTO.getModel());

				preparedStatement.execute();

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateVehicleDetails(AutomobileDTO automobileDTO) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String updateQuery = "update vehicle set color=?,model=? where id=?";
		try (Connection connection = DriverManager.getConnection(url, usename, password);
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);) {

			preparedStatement.setString(1, "Pink");
			preparedStatement.setInt(2, 3);
			preparedStatement.setInt(3, 1);

			preparedStatement.executeUpdate();

			System.out.println("updation done..");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateVehicleDetaols(Set<AutomobileDTO> automobileDTOs) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String updateQuery = "update vehicle set color=?,model=? where name=?";
		try (Connection connection = DriverManager.getConnection(url, usename, password);
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);) {

			preparedStatement.setString(1, "Red");
			preparedStatement.setInt(2, 12);
			preparedStatement.setString(3, "Honda");

			preparedStatement.executeUpdate();

			System.out.println("updation done..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	List<AutomobileDTO> list = new ArrayList<AutomobileDTO>();

	@Override
	public List<AutomobileDTO> fetchAllVehicleDetails() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String fetchData = "SELECT * FROM vehicle";
		try (Connection connection = DriverManager.getConnection(url, usename, password);
				PreparedStatement preparedStatement = connection.prepareStatement(fetchData);
				ResultSet resultSet = preparedStatement.executeQuery();) {

			while (resultSet.next()) {
//				System.out.println("**********************");
//				System.out.println(resultSet.getInt("id"));
//				System.out.println(resultSet.getString("name"));
//				System.out.println(resultSet.getString("color"));
//				System.out.println(resultSet.getString("vehicleType"));
//				System.out.println(resultSet.getInt("model"));

				AutomobileDTO automobileDTO = new AutomobileDTO();
				automobileDTO.setId(resultSet.getInt("id"));
				automobileDTO.setName(resultSet.getString("name"));
				automobileDTO.setColor(resultSet.getString("color"));
				automobileDTO.setVehicleType(resultSet.getString("vehicleType"));
				automobileDTO.setModel(resultSet.getInt("model"));

				list.add(automobileDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void deleteVehicleByName(String vehicleName) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String deleteQuery = "DELETE FROM vehicle WHERE name = ?";

		try (Connection connection = DriverManager.getConnection(url, usename, password);
				PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);) {

			preparedStatement.setString(1, vehicleName);
			preparedStatement.executeUpdate();

			System.out.println("delete is done..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
