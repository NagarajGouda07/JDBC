package com.xworkz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Train {

	public static void main(String[] args) {

		String URL = "jdbc:mysql://localhost:3306/train";
		String UserName = "root";
		String Password = "Nagaraj@007";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(URL, UserName, Password);

			if (connection != null) {
				System.out.println("This is a connected");
			} else {
				System.out.println("This is not connected");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
