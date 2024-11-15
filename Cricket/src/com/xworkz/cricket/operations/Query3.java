package com.xworkz.cricket.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cricket.enums.CricketEnum;

public class Query3 {

	public static void main(String[] args) {


		String query3 = "select password FROM cricket WHERE f_Name='Rohit' AND gender='m';";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(CricketEnum.URL.getValue(), CricketEnum.USERNAME.getValue(),
					CricketEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
