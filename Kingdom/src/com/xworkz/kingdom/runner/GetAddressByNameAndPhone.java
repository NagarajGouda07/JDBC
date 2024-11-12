package com.xworkz.kingdom.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.kingdom.dto.VijayanagaraEmpireEnum;

public class GetAddressByNameAndPhone {

	public static void main(String[] args) {

		String first_name = "Ashoka";
		String phone_number = "9876543210";

		String query = "SELECT address FROM kingdom WHERE first_name = '" + first_name + "' AND phone_number = '" + phone_number
				+ "'";
		Connection connection = null;

		try {
			// Establish connection using credentials from EmployeeEnum
			connection = DriverManager.getConnection(
					VijayanagaraEmpireEnum.URL.getValue(),
					VijayanagaraEmpireEnum.USERNAME.getValue(),
					VijayanagaraEmpireEnum.PASSWORD.getValue());

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
