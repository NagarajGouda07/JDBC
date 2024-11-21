package com.xworkz.mobile.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.mobile.repository.MobileRepositoryImpl;


@WebServlet(loadOnStartup = 1, urlPatterns = "/getData")
public class GetServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String age = req.getParameter("age");
		
		int age1 = Integer.valueOf(age);
		
        String nameParam = req.getParameter("name");
        String emailParam = req.getParameter("email");
        
        MobileRepositoryImpl repository = new MobileRepositoryImpl();
		
        List<String> namesByAge = null;
        String emailByName = null;
        String nameByEmail = null;
		
        namesByAge = repository.getNameByAge(age1);
        emailByName = repository.getEmailByName(nameParam);
        nameByEmail = repository.getNameByEmail(emailParam);
        req.setAttribute("namesByAge", namesByAge);
        req.setAttribute("emailByName", emailByName);
        req.setAttribute("nameByEmail", nameByEmail);
        
		RequestDispatcher dispatcher = req.getRequestDispatcher("details.jsp");
		dispatcher.forward(req, resp);
	}
}
