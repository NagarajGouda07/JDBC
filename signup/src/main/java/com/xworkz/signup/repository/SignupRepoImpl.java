package com.xworkz.signup.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.signup.constant.SignupEnum;
import com.xworkz.signup.dto.SignupDto;

public class SignupRepoImpl implements SingupRepo {

	@Override
	public boolean save(SignupDto dto) {
		boolean valid = false;

		Connection connection = null;
		PreparedStatement pst = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(SignupEnum.URL.getValue(), SignupEnum.USERNAME.getValue(),
					SignupEnum.PASSWORD.getValue());

			pst = connection.prepareStatement("INSERT INTO ram VALUES(?,?,?,?)");

		
			pst.setString(1, dto.getName());
			pst.setString(2, dto.getName());
			pst.setString(3, dto.getEmail());
			pst.setString(4, dto.getPassword());
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
