package com.xworkz.management.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.management.dto.ManagementEnum;

public class GetNameByEmailAndPassword {

	public static void main(String[] args) {

		String email = "anuj.patel@example.com";
		String password = "Patel";

		String query = "SELECT first_name FROM car WHERE email = '" + email + "' AND password = '" + password
				+ "'";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ManagementEnum.URL.getValue(), ManagementEnum.USERNAME.getValue(),
					ManagementEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			if (resultSet.next()) {
				String name = resultSet.getString("first_name");

				System.out.println("Name: " + name);
			} else {
				System.out.println("No matching record found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
