package com.xworkz.connection.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Company {

	public static void main(String[] args) {

		String URL = "jdbc:mysql://localhost:3306/Company";
		String USERNAME = "root";
		String PASSWORD = "Nagaraj@007";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			if (connection != null) {
				System.out.println("This is connected....>>>>");
			} else {
				System.out.println("This is not connected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
