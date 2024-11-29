package com.xworkz.mobile.repository;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.xworkz.mobile.dto.MobileDTO;

public class MobileRepositoryImpl implements MobileRepository {

	private static final String URL = "jdbc:mysql://localhost:3306/users";
	private static final String USER = "root";
	private static final String PASSWORD = "Nagaraj@007";

	// Method to insert data into the table
	public boolean insertData(MobileDTO mobileDTO) {
		boolean isInserted = false;
		String query = "INSERT INTO details (name, email, age, phone, password, address) VALUES (?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, mobileDTO.getName());
			preparedStatement.setString(2, mobileDTO.getEmail());
			preparedStatement.setInt(3, mobileDTO.getAge());
			preparedStatement.setString(4, mobileDTO.getPhone());
			preparedStatement.setString(5, mobileDTO.getPassword());
			preparedStatement.setString(6, mobileDTO.getAddress());

			int result = preparedStatement.executeUpdate();
			if (result > 0) {
				isInserted = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isInserted;
	}

	// Method to fetch data by ID
	public MobileDTO getDataById(int id) {
		MobileDTO mobileDTO = null;
		String query = "SELECT * FROM details WHERE id = ?";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setInt(1, id);
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.next()) {
					mobileDTO = new MobileDTO(resultSet.getString("name"), resultSet.getString("email"),
							resultSet.getInt("age"), resultSet.getString("phone"), resultSet.getString("password"),
							resultSet.getString("address"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mobileDTO;
	}

	// Method to get name and email by phone
	public String getNameAndEmailByPhone(String phone) {
		String nameEmail = null;
		String query = "SELECT name, email FROM details WHERE phone = ?";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, phone);
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.next()) {
					nameEmail = "Name: " + resultSet.getString("name") + ", Email: " + resultSet.getString("email");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nameEmail;
	}

	// Method to validate email and password
	public boolean validateEmailAndPassword(String email, String password) {
		boolean isValid = false;
		String query = "SELECT * FROM details WHERE email = ? AND password = ?";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.next()) {
					isValid = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValid;
	}

	// Method to delete a record by ID
	public boolean deleteById(int id) {
		boolean isDeleted = false;
		String query = "DELETE FROM details WHERE id = ?";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setInt(1, id);
			int result = preparedStatement.executeUpdate();
			if (result > 0) {
				isDeleted = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	// Method to update a record by email
	public boolean updateByEmail(String email, String newName, String newPhone) {
		boolean isUpdated = false;
		String query = "UPDATE details SET name = ?, phone = ? WHERE email = ?";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, newName);
			preparedStatement.setString(2, newPhone);
			preparedStatement.setString(3, email);
			int result = preparedStatement.executeUpdate();
			if (result > 0) {
				isUpdated = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isUpdated;
	}

	// Main method for testing
	public static void main(String[] args) {
		MobileRepositoryImpl repository = new MobileRepositoryImpl();

		// Example: Insert data
		MobileDTO newMobile = new MobileDTO("John Doe", "john.doe@example.com", 30, "1234567890", "password123",
				"123 Main St");
		boolean isInserted = repository.insertData(newMobile);
		System.out.println("Data inserted: " + isInserted);

		// Example: Get data by ID
		MobileDTO mobileById = repository.getDataById(1);
		if (mobileById != null) {
			System.out.println("Data by ID: " + mobileById.getName() + ", " + mobileById.getEmail());
		}

		// Example: Validate email and password
		boolean isValid = repository.validateEmailAndPassword("john.doe@example.com", "password123");
		System.out.println("Valid credentials: " + isValid);

		// Example: Delete by ID
		boolean isDeleted = repository.deleteById(1);
		System.out.println("Data deleted: " + isDeleted);

		// Example: Update by email
		boolean isUpdated = repository.updateByEmail("john.doe@example.com", "Johnathan Doe", "9876543210");
		System.out.println("Data updated: " + isUpdated);
	}

	@Override
	public boolean save(MobileDTO mobileDTO) {
		// TODO Auto-generated method stub
		return false;
	}
}
