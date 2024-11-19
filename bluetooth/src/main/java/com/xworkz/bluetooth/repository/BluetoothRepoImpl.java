package com.xworkz.bluetooth.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.bluetooth.constant.BluetoothEnum;
import com.xworkz.bluetooth.dto.BluetoothDto;


public class BluetoothRepoImpl implements BluetoothRepo {

	@Override
	public boolean save(BluetoothDto dto) {
		boolean valid = false;

		Connection connection = null;
		PreparedStatement pst = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(BluetoothEnum.URL.getValue(), BluetoothEnum.USERNAME.getValue(),
					BluetoothEnum.PASSWORD.getValue());

			pst = connection.prepareStatement("INSERT INTO ram VALUES(?,?,?,?)");

		
			pst.setString(1, dto.getName());
			pst.setString(2, dto.getName());
			pst.setString(3, dto.getEmail());
			pst.setInt(4, dto.getAge());
			int save = pst.executeUpdate();

			if (save > 0) {
				valid = true;
				System.out.println("data is saved");
			} else {
				valid = false;
				System.out.println("data is not saved");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return valid;
	}

}
