package com.xworkz.management.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.management.dto.ManagementEnum;

public class GetAddressByNameAndPhone {

	public static void main(String[] args) {

		String first_name = "Swati";
		String phone_number = "9876543108";

		String query = "SELECT address FROM car WHERE first_name = '" + first_name + "' AND phone_number = '" + phone_number
				+ "'";
		Connection connection = null;

		try {
			// Establish connection using credentials from EmployeeEnum
			connection = DriverManager.getConnection(ManagementEnum.URL.getValue(), ManagementEnum.USERNAME.getValue(),
					ManagementEnum.PASSWORD.getValue());

			// Create a statement and execute the query
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			// If the resultSet contains data, retrieve the address
			if (resultSet.next()) {
				String address = resultSet.getString("address");
				System.out.println("Address: " + address);
			} else {
				System.out.println("No matching record found.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
