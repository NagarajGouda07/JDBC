package com.xworkz.kingdom.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.kingdom.dto.VijayanagaraEmpireEnum;

public class SelectAll {

	public static void main(String[] args) {

		String query = "select * from kingdom";
		Connection connnection = null;
		try {
			connnection = DriverManager.getConnection(
					VijayanagaraEmpireEnum.URL.getValue(),
					VijayanagaraEmpireEnum.USERNAME.getValue(),
					VijayanagaraEmpireEnum.PASSWORD.getValue());
			
			Statement statement = connnection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {

				System.out.println("data from table ==>> " + resultSet.getString("id"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
