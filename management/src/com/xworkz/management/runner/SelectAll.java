package com.xworkz.management.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.management.dto.ManagementEnum;


public class SelectAll {

	public static void main(String[] args) {

		String query = "select * from car";
		Connection connnection = null;
		try {
			connnection = DriverManager.getConnection(
					ManagementEnum.URL.getValue(), 
					ManagementEnum.USERNAME.getValue(),
					ManagementEnum.PASSWORD.getValue());
			Statement statement = connnection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {

				System.out.println("data from table ==>> " + resultSet.getString("first_name"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
