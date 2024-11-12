package com.xworkz.hotel.runner.operation;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hotel.runner.dto.EmployeeEnum;

public class SelectAll {

	public static void main(String[] args) {

		String query = "select * from employee";
		Connection connnection = null;
		try {
			connnection = DriverManager.getConnection(EmployeeEnum.URL.getValue(), EmployeeEnum.USERNAME.getValue(),
					EmployeeEnum.PASSWORD.getValue());
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
