package com.xworkz.hotel.runner.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hotel.runner.dto.EmployeeEnum;

public class GetAddressByNameAndPhone {

	public static void main(String[] args) {

		String name = "Rahul";
		String phone = "9876543219";

		String query = "SELECT address FROM employee WHERE first_name = '" + name + "' AND phone_number = '" + phone + "'";
		Connection connection = null;

		try {
			// Establish connection using credentials from EmployeeEnum
			connection = DriverManager.getConnection(EmployeeEnum.URL.getValue(), EmployeeEnum.USERNAME.getValue(),
					EmployeeEnum.PASSWORD.getValue());

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
