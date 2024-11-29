package com.xworkz.signup.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.signup.dto.SignupDto;
import com.xworkz.signup.service.SignupServiceImpl;

@WebServlet(urlPatterns = "/sign")
public class SignupServlet extends HttpServlet {

	public SignupServlet() {
		System.out.println("SignupServletCreated....");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		SignupDto dto = new SignupDto(name, lname, email, password);

		SignupServiceImpl imp = new SignupServiceImpl();
		imp.save(dto);

	}

}
