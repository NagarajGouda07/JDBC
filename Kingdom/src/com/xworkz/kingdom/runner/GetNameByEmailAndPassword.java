package com.xworkz.kingdom.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.kingdom.dto.VijayanagaraEmpireEnum;

public class GetNameByEmailAndPassword {

	public static void main(String[] args) {

		String email = "ashoka.maurya@example.com";
		String password = "Maurya";

		String query = "SELECT first_name FROM kingdom WHERE email = '" + email + "' AND password = '" + password
				+ "'";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(VijayanagaraEmpireEnum.URL.getValue(),
					VijayanagaraEmpireEnum.USERNAME.getValue(), VijayanagaraEmpireEnum.PASSWORD.getValue());
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
