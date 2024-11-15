package com.xworkz.cricket.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cricket.enums.CricketEnum;

public class Query {

	public static void main(String[] args) {

		String query = "select * from cricket";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(CricketEnum.URL.getValue(), CricketEnum.USERNAME.getValue(),
					CricketEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {

				System.out.println(resultSet.getInt("id") + "," + resultSet.getString("f_name") + ","
						+ resultSet.getString("email"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
