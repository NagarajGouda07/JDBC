package com.xworkz.mobile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.xworkz.mobile.dto.MobileDTO;

@WebServlet(urlPatterns = "/submit, /mobile")
public class MobileServlet extends HttpServlet {
	private static final String URL = "jdbc:mysql://localhost:3306/users"; // Replace with your DB URL
	private static final String USER = "root"; // Replace with your DB username
	private static final String PASSWORD = "Nagaraj@007"; // Replace with your DB password

	// Method to insert data into the table
	private boolean insertData(MobileDTO mobileDTO) {
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

	// Method to get data by ID
	private MobileDTO getDataById(int id) {
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

	// Method to validate email and password
	private boolean validateEmailAndPassword(String email, String password) {
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
	private boolean deleteById(int id) {
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
	private boolean updateByEmail(String email, String newName, String newPhone) {
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

	// HTTP GET method for handling requests
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if ("getDataById".equals(action)) {
			int id = Integer.parseInt(request.getParameter("id"));
			MobileDTO mobileDTO = getDataById(id);
			response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			if (mobileDTO != null) {
				out.println("{\"name\": \"" + mobileDTO.getName() + "\", \"email\": \"" + mobileDTO.getEmail() + "\"}");
			} else {
				out.println("{\"message\": \"Record not found.\"}");
			}
		}
	}

	// HTTP POST method for handling requests
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		boolean result = false;

		if ("insert".equals(action)) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			int age = Integer.parseInt(request.getParameter("age"));
			String phone = request.getParameter("phone");
			String password = request.getParameter("password");
			String address = request.getParameter("address");

			MobileDTO mobileDTO = new MobileDTO(name, email, age, phone, password, address);
			result = insertData(mobileDTO);
		} else if ("validate".equals(action)) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			result = validateEmailAndPassword(email, password);
		} else if ("delete".equals(action)) {
			int id = Integer.parseInt(request.getParameter("id"));
			result = deleteById(id);
		} else if ("update".equals(action)) {
			String email = request.getParameter("email");
			String newName = request.getParameter("newName");
			String newPhone = request.getParameter("newPhone");
			result = updateByEmail(email, newName, newPhone);
		}

		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		if (result) {
			out.println("{\"status\": \"success\"}");
		} else {
			out.println("{\"status\": \"failure\"}");
		}
	}
}
