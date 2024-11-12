package com.xworkz.management.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.management.dto.ManagementEnum;


public class GetNameByIdGreaterThan10 {
	
	public static void main(String[] args) {
		// SQL query to get the name where ID is greater than 10
		String query = "SELECT id FROM car WHERE id > 10";
		Connection connection = null;

		try {
			// Establish connection using credentials from EmployeeEnum
			connection = DriverManager.getConnection(ManagementEnum.URL.getValue(), ManagementEnum.USERNAME.getValue(),
					ManagementEnum.PASSWORD.getValue());

			// Create a statement and execute the query
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			// If the resultSet contains data, retrieve the name
			while (resultSet.next()) {
				String id = resultSet.getString("id");
				System.out.println("Id: " + id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
