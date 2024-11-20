package com.xworkz.orderform.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.orderform.constant.OrderEnum;
import com.xworkz.orderform.dto.OrderDto;

public class OrderRepoImpl implements OrderRepo {

	@Override
	public boolean Save(OrderDto orderDto) {
		System.out.println("Running valideAndSave in OrderRepoImpl");
		boolean isValid = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = null;
			PreparedStatement preparedState = null;

			connection = DriverManager.getConnection(OrderEnum.URL.getValue(), OrderEnum.USERNAME.getValue(),
					OrderEnum.PASSWORD.getValue());

			preparedState = connection.prepareStatement("INSERT INTO order_details VALUES(?,?,?,?,?,?,?,?)");

			preparedState.setString(1, orderDto.getName());
			preparedState.setString(2, orderDto.getEmail());
			preparedState.setString(3, orderDto.getPhone());
			preparedState.setString(4, orderDto.getAddress());
			preparedState.setString(5, orderDto.getCity());
			preparedState.setInt(6, orderDto.getPincode());

			int value = preparedState.executeUpdate();

			if (value > 0) {
				System.out.println("Order saved successfully.");
				isValid = true;
			} else {
				System.out.println("Order not saved.");
				isValid = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValid;
	}

}
