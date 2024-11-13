package com.xworkz.fooditems.runner;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.xworkz.fooditems.dto.LaptopEnum;

public class LaptopRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = null;
			PreparedStatement pst = null;
			connection = DriverManager.getConnection(LaptopEnum.URL.getValue(), LaptopEnum.USERNAME.getValue(),
					LaptopEnum.PASSWORD.getValue());
			
			

			PreparedStatement pst2 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst2.setString(1, "1");
			pst2.setString(2, "Hp");
			pst2.setString(3, "450000");

			PreparedStatement pst3 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			
			pst3.setString(1, "2");
			pst3.setString(2, "MacBook Air");
			pst3.setString(3, "434500");

			PreparedStatement pst4 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			
			pst4.setString(1, "3");
			pst4.setString(2, "MacBook Pro");
			pst4.setString(3, "980776");

			PreparedStatement pst5 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			
			pst5.setString(1, "4");
			pst5.setString(2, "Dell XPS 13");
			pst5.setString(3, "950000");

			PreparedStatement pst6 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			
			pst6.setString(1, "5");
			pst6.setString(2, "Dell Inspiron 15");
			pst6.setString(3, "850000");

			PreparedStatement pst7 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			
			pst7.setString(1, "6");
			pst7.setString(2, "HP Envy 13");
			pst7.setString(3, "450000");

			PreparedStatement pst8 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst8.setString(1, "7");
			pst8.setString(2, "Acer Aspire 5");
			pst8.setString(3, "890000");

			PreparedStatement pst9 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst9.setString(1, "8");
			pst9.setString(2, "Acer Swift 3");
			pst9.setString(3, "459000");

			PreparedStatement pst10 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst10.setString(1, "9");
			pst10.setString(2, "LG Gram 17");
			pst10.setString(3, "950000");

			PreparedStatement pst11 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst11.setString(1, "10");
			pst11.setString(2, "MSI Creator Z16");
			pst11.setString(3, "890000");

			PreparedStatement pst12 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst12.setString(1, "11");
			pst12.setString(2, "Razer Book 13");
			pst12.setString(3, "850000");

			PreparedStatement pst13 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst13.setString(1, "12");
			pst13.setString(2, "Razer Blade 15 ");
			pst13.setString(3, "750000");

			PreparedStatement pst14 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst14.setString(1, "13");
			pst14.setString(2, "MSI Creator Z16");
			pst14.setString(3, "850000");

			PreparedStatement pst16 = connection.prepareStatement("insert into laptops values(?, ?, ?)");
			pst16.setString(1, "14");
			pst16.setString(2, "Microsoft Surface Laptop 5");
			pst16.setString(3, "970000");

			

		
			int values2 = pst2.executeUpdate();
			int values3 = pst3.executeUpdate();
			int values4 = pst4.executeUpdate();
			int values5 = pst5.executeUpdate();
			int values6 = pst6.executeUpdate();
			int values7 = pst7.executeUpdate();
			int values8 = pst8.executeUpdate();
			int values9 = pst9.executeUpdate();
			int values10 = pst10.executeUpdate();
			int values11 = pst11.executeUpdate();
			int values12 = pst12.executeUpdate();
			int values13 = pst13.executeUpdate();
			int values14 = pst14.executeUpdate();
			int values16 = pst16.executeUpdate();

			int[] values = { values2, values3, values4, values5, values6, values7, values8, values9, values10,
					values11, values12, values13, values14, values16 };

			for (int i : values) {
				if (i > 0) {
					System.out.println("Data is saved");
				} else {
					System.out.println("Data is not saved");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
