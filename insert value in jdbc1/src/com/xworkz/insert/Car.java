package com.xworkz.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Car {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/york";
		String userName = "root";
		String password = "Nagaraj@007";
		String insertQuery = "insert into yorkname value(1, 'Toyota Camry', '200000'),(2, 'Honda Accord', '300000'),(3, 'Ford Mustang', '250000'),(4, 'Chevrolet Camaro', '400000'),(5, 'BMW 3 Series', '500000'),"
				+ "(6, 'Audi A4', 5090000),(7, 'Mercedes-Benz C-Class', '25500000'),(8, 'Tesla Model S', '6700000'),(9, 'Hyundai Elantra', '9000000'),(10, 'Nissan Altima', '20000000'),(11, 'Volkswagen Golf', '26600000'),"
				+ "(12, 'Jeep Wrangler', '9000000'),(13, 'Subaru Outback', '45500000'),(14, 'Kia Sorento', '8700000'),(15, 'Lexus RX', '6500000'),(16, 'Volvo XC90', '78000000'),(17, 'Mazda CX-5', '23000000'),(18, 'Dodge Charger', '98000000'),"
				+ "(19, 'Porsche 911', '10000000'),(20, 'Land Rover Defender', '54000000')";
	
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();

			int value = statement.executeUpdate(insertQuery);

			if (value > 0) {
				System.out.println("Record inserted successfully ");
			} else {
				System.out.println("Record inserted failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
