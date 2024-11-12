package com.xworkz.hotel.runner.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hotel.runner.dto.EmployeeEnum;

public class GetNameByEmailAndPassword {

	public static void main(String[] args) {

		String email = "rajesh.sharma@example.com";
		String password = "Sharma";

		String query = "SELECT first_name FROM employee WHERE email = '" + email + "' AND password = '" + password
				+ "'";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(EmployeeEnum.URL.getValue(), EmployeeEnum.USERNAME.getValue(),
					EmployeeEnum.PASSWORD.getValue());
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
