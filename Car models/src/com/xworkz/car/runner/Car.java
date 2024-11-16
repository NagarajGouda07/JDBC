package com.xworkz.car.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.xworkz.car.dto.CarEnum;

public class Car {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement pst = null;
		Scanner sc = new Scanner(System.in);

		// Load and install the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {

			connection = DriverManager.getConnection(CarEnum.URL.getValue(), CarEnum.USERNAME.getValue(),
					CarEnum.PASSWORD.getValue());

			// Prepare the SQL statement
			pst = connection.prepareStatement("INSERT INTO carmodel VALUES (?, ?, ?, ?)");

			while (true) {
				System.out.println("Enter your Id:");
				int id = sc.nextInt();

				System.out.println("Enter your Name:");
				String name = sc.next();

				System.out.println("Enter your Salary:");
				long salary = sc.nextLong();

				System.out.println("Enter your Address:");
				String address = sc.next();

				// Set values for the placeholders
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setLong(3, salary);
				pst.setString(4, address);

				// Execute the insert command
				pst.executeUpdate();

				System.out.println("Record inserted successfully.");

				// Prompt for another entry
				System.out.println("Do you want to insert one more record? [yes/No]");
				String option = sc.next();

				if (option.equalsIgnoreCase("No")) {
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
