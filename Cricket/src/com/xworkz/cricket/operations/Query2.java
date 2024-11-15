package com.xworkz.cricket.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cricket.enums.CricketEnum;

public class Query2 {

	public static void main(String[] args) {

		String query2 = "select age from cricket where f_name = 'Virat' and l_name = 'Kohli';";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(CricketEnum.URL.getValue(), CricketEnum.USERNAME.getValue(),
					CricketEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query2);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
