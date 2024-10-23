package com.xworkz.connection.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/phone";
		String userName = "root";
		String password = "Nagaraj@007";
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			
			if(connection != null) {
				System.out.println("this is a connected  >>>>>");
			}else {
				System.out.println("this is a not connected ");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
