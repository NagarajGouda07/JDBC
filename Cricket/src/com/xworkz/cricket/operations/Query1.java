package com.xworkz.cricket.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cricket.enums.CricketEnum;

public class Query1 {

	public static void main(String[] args) {

		String query = "SELECT id FROM cricket WHERE id > 5";
		Connection connection = null;

		try {
			// Establish connection using credentials from EmployeeEnum
			connection = DriverManager.getConnection(CricketEnum.URL.getValue(), CricketEnum.USERNAME.getValue(),
					CricketEnum.PASSWORD.getValue());

			// Create a statement and execute the query
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			// If the resultSet contains data, retrieve the name
			while (resultSet.next()) {
				
				System.out.println(resultSet.getString("id") + "," + resultSet.getString("f_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
