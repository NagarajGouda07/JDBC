package com.xworkz.phone.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.phone.dto.RealmeEnum;

public class GetEmailAndPasswordByPhoneAndName {

	public static void main(String[] args) {

		String phone_number = "9876543112";
		String first_name = "Pooja";

		phone_number = phone_number.replace("'", "''");
		first_name = first_name.replace("'", "''");

		String query = "SELECT email, password FROM phones WHERE phone_number = '" + phone_number + "' AND first_name = '"
				+ first_name + "'";
		Connection connection = null;

		try {

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
