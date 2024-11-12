package com.xworkz.phone.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.phone.dto.RealmeEnum;

public class SelectAll {

	public static void main(String[] args) {

		String query = "select * from phones";
		Connection connnection = null;
		try {
			connnection = DriverManager.getConnection(RealmeEnum.URL.getValue(), RealmeEnum.USERNAME.getValue(),
					RealmeEnum.PASSWORD.getValue());
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
