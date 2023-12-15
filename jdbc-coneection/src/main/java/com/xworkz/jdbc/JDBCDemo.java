package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//step1: Load and register Driver class--> class.forName("com.mysql.jdbc.Driver)
//step2: establish connection from database
//step3: create a statement
//step4: execute the sql query
//step5: process the resultant data 
//step6: close the connection i.e costly resources.

public class JDBCDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/city";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String query = "insert into location values(1,'Banglore',566001),(2,'Mandya',987578),(3,'Hospete',542475),(4,'Durga',456875),"
				+ "(5,'Hampi',583219),(6,'Bellary',673463),(7,'Mysore',863593),(8,'Hasan',348753),(9,'Mangalore',56780),(10,'Koppal',667865)";

		String addColumn = "ALTER TABLE location ADD COLUMN state VARCHAR(20) DEFAULT 'Karnataka'";

		String delete = "DELETE FROM location WHERE id=2";

		String update = "update location set cityName='Kodagu' where id=6";

		try {
			Connection conn = DriverManager.getConnection(url, userName, password);

			Statement stmt = conn.createStatement();
			stmt.executeUpdate(update);
//			stmt.execute(truncate);
			// execute() --boolean : DDL, DML
			// executeUpdate() is used for DML returns int: DML
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
