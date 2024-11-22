package com.xworkz.college.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.service.CollegeServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/delete")
public class IdServlet extends HttpServlet {
	public IdServlet() {
		System.out.println("created no args IdServlet const");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int convertedId = Integer.valueOf(id);
		CollegeServiceImpl collegeServiceImpl = new CollegeServiceImpl();
		int ref = collegeServiceImpl.deleteDataById(convertedId);
		if (ref > 0) {
			System.out.println("id is " + id);
			req.setAttribute("success", "id " + id + " is deleted");
		} else {
			System.err.println("id not found");
			req.setAttribute("failure", "id not deleted");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("name.jsp");
		dispatcher.forward(req, resp);
	}

}
