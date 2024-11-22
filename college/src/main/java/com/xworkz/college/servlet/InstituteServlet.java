package com.xworkz.college.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDTO;
import com.xworkz.college.service.CollegeServiceImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/select")
public class InstituteServlet extends HttpServlet {

	public InstituteServlet() {
		System.out.println("running no args InstituteServlet const");
	}

	int id = 1;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("passwod");
		String number = req.getParameter("number");
		String age = req.getParameter("age");
		String address = req.getParameter("address");

		long convertedNumber = Long.valueOf(number);
		int convertedAge = Integer.valueOf(age);

		CollegeDTO collegeDTO = new CollegeDTO(name, email, password, convertedNumber, convertedAge, address, id);

		CollegeServiceImpl collegeServiceImpl = new CollegeServiceImpl();
		boolean saved = collegeServiceImpl.validate(collegeDTO);
		if (saved) {
			System.out.println("valid and saved ");
			id = id + 1;
			System.out.println(id);

		} else
			System.err.println("invalid and not saved");

	}

}
