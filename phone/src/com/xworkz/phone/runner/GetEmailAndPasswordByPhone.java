package com.xworkz.phone.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.phone.dto.RealmeEnum;

public class GetEmailAndPasswordByPhone {

	public static void main(String[] args) {

		String phone_number = "9876543109";

		phone_number = phone_number.replace("'", "''");

		String query = "SELECT email, password FROM phones WHERE phone_number = '" + phone_number + "'";
		Connection connection = null;

		try {
			// Establish connection using credentials from EmployeeEnum
			connection = DriverManager.getConnection(RealmeEnum.URL.getValue(), RealmeEnum.USERNAME.getValue(),
					RealmeEnum.PASSWORD.getValue());

			// Create a statement and execute the query
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			// If the resultSet contains data, retrieve the email and password
			if (resultSet.next()) {
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				System.out.println("Email: " + email);
				System.out.println("Password: " + password); // Be cautious with this in production
			} else {
				System.out.println("No matching record found.");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
