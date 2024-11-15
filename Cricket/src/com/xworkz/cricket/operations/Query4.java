package com.xworkz.cricket.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cricket.enums.CricketEnum;

public class Query4 {

	public static void main(String[] args) {

		String query4 = "select email,password FROM cricket where age=' 37 ' AND f_Name=' Shikhar'";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(CricketEnum.URL.getValue(), CricketEnum.USERNAME.getValue(),
					CricketEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query4);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
